package StreamIo.HM;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.stream.Collectors;

public class ConfigMap {
    public String getValueFromConfig(Path configFileMapPath, String keyName) throws IOException {
        if (configFileMapPath == null || keyName == null) {
            return null;
        }
        Map<String,String> collect = Files.lines(configFileMapPath).collect(Collectors.toMap(
                line -> ((String) line).split("=")[0], line -> ((String)line).split("=")[1]
        ));
        return collect.get(keyName);
    }
}

//        Map<String, String> map = Files.lines(configFileMapPath).collect(Collectors.toMap(
//                line -> ((String) line).split("=")[0], line -> ((String) line).split("=")[1]
//        ));
//        return map.get(keyName);
