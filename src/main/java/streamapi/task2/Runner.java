package main.java.streamapi.task2;

public class Runner {
    public static void main(String[] args) {

        ThreeFunction<String, String, String> func = (s1, s2) -> s1.concat(s2);
        System.out.println(func.apply("Functional interfaces ", " in Java 8"));
    }
}
