import java.io.*;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new  File("balance.txt"));
        int currentBalance = sc.nextInt();
        System.out.println(currentBalance);

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter deposit amount: " );
        int depositAmount = sc1.nextInt();

        currentBalance += depositAmount;

        System.out.println("Updated balance is : " + currentBalance);

        FileOutputStream fos = new FileOutputStream("balance.txt");

        int bal = currentBalance;

        String send = Integer.toString(bal);
        byte b[] = send.getBytes();

        fos.write(b);
        fos.close();

    }
}
