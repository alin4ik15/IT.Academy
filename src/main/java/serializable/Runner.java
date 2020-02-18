package main.java.serializable;

import java.io.*;

public class Runner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Cat cat = new Cat("vasia", 1, 4);
        System.out.println(cat.toString());

        FileOutputStream fileOutput = new FileOutputStream("vania");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput);
        outputStream.writeObject(cat);
        //fileOutput.close();
        outputStream.close();

        FileInputStream fiStream = new FileInputStream("vania");
        ObjectInputStream objectStream = new ObjectInputStream(fiStream);
        Object object = objectStream.readObject();
        //fiStream.close();
        objectStream.close();

        Cat newCat = (Cat) object;
        System.out.println(object);
    }
}
