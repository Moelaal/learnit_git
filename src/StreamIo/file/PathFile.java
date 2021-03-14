package StreamIo.file;

import java.io.IOError;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathFile {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("testDirectoryNio","testOne");
        Files.isDirectory(path);
        Files.isRegularFile(path);
        Files.createFile(path);

       Path filePath = Paths.get("testDirectory","result.csv");
       if(!Files.exists(filePath)){
           Files.createFile(filePath);
       }
       Files.delete(filePath);
    }
}
