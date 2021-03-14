package StreamIo;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class SerializationDemo {
    public static void main(String[] args) {
        Employee empl = new Employee();
        empl.setId(1);
        empl.setName("Body");
        Map<String, String> props = new HashMap<>();
        props.put("salary","10000");
        props.put("City","Moscow");
        empl.setProps(props);

        var byteArrayOutputStream = serializeEmployee(empl);
        Employee copyEmployee = deserializeEmployee(byteArrayOutputStream);
        System.out.println(copyEmployee);
    }

    private static ByteArrayOutputStream serializeEmployee(Employee empl){
        try(var byteArrayOutputStream = new ByteArrayOutputStream();
                var oos = new ObjectOutputStream(byteArrayOutputStream)){
            oos.writeObject(empl);
            return byteArrayOutputStream;
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }

    private static Employee deserializeEmployee(ByteArrayOutputStream inputStream){
        try (var ois = new ObjectInputStream(new ByteArrayInputStream(inputStream.toByteArray()))){
            return (Employee) ois.readObject();
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }
}
