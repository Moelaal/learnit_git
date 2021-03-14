package StreamIo.HM;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demooooooo {
    public static void main(String[] args) {
        File file = new File("mr.txt");
        FileOutputStream fos;

        try {
            fos = new FileOutputStream(file);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
