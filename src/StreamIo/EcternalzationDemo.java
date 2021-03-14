package StreamIo;

import java.io.*;

public class EcternalzationDemo {
    public static void main(String[] args) {
        User user = new User("nickname", "password");
        var byteArrayOutputStream = serializerUser(user);
        User copyUser = deserializeUser(byteArrayOutputStream);
        System.out.println(copyUser);
    }
    private static ByteArrayOutputStream serializerUser(User empl){
        try(var byteArrOutputStream = new ByteArrayOutputStream();
                var oos = new ObjectOutputStream(byteArrOutputStream)){

            oos.writeObject(empl);
            return byteArrOutputStream;
        }catch(IOException e){
            e.printStackTrace();
        }
        return null;
    }
    private static  User deserializeUser(ByteArrayOutputStream inputStream){
        try(var ois = new ObjectInputStream(new ByteArrayInputStream(inputStream.toByteArray()))){
            return (User) ois.readObject();
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }

}
