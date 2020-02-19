package main.java.task33;

import java.io.File;

public class Runner {
    public static void main(String[] args) {

        File originalFile = new File("E:\\test\\IT.Academy\\src\\main\\java\\task33\\Start");

        File folder = originalFile.getParentFile();

        for (File file : folder.listFiles()) {
            System.out.println(file.getName());
        }

    }
}
