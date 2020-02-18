package main.java.task30;

import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException {

        File file = new File("E:\\test\\IT.Academy\\src\\main\\java\\task30\\hello");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);

        String line;
        int words = 0;
        int punctuationMarks = 0;


        while ((line = reader.readLine()) != null) {
            String[] wordList = line.split(("\\s+"));
            words += wordList.length;

            String[] marksList = line.split(("[!?.,:]"));
            punctuationMarks += marksList.length;

        }
        System.out.println("Total words = " + words);
        System.out.println("Total punctuation marks = " + punctuationMarks);
    }
}
