package collections;

import java.util.ArrayList;

public class Iter {

    public static void main(String[] args) {
        int element = 10;
        ArrayList<Integer> mark = new ArrayList<>();
        for (int i = 0; i < element; i++) {
            int a = (int) (Math.random() * 10 + 1);
            mark.add(a);
        }
        System.out.println(mark);
        int max = mark.get(0);
        int x = 1;
        while (x > 0) {
            for (Integer integer : mark) {
                if (max < integer) {
                    max = integer;
                }
            }
            x--;
            System.out.println("Maximum value " + max);
        }
    }
}
