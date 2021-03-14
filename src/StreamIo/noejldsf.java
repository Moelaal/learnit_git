package StreamIo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class noejldsf {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Please enter ");
        PrintWriter pw = new PrintWriter(System.out,true);


        try {
            String word = br.readLine();
            pw.println(word);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
