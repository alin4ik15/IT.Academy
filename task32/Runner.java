package main.java.task32;

import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException {
        DataOutputStream number = new DataOutputStream(new FileOutputStream("E:/file.txt"));
        for (int i = 0; i < 21; i++) {
            number.writeInt((int) (Math.random() * 100));
        }
        number.close();

        FileInputStream e = new FileInputStream("E:/file.txt");
        BufferedReader d = new BufferedReader(new InputStreamReader(e));

        int sum = 0;
        for (int i = 0; i < 21; i++) {
            int n = d.read();
            sum += n;
        }
        System.out.print("Arithmetical mean of twenty random numbers is " + sum / 20);
    }
}
