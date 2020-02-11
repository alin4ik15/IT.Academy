package main.java.streamapi.task2;

@FunctionalInterface
public interface ThreeFunction<T,U,R> {
    R apply(T t,U u);

}