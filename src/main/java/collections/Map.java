package collections;

import java.util.ArrayList;

public class Map {

    public static void main(String[] args) {
        int element = 10;
        ArrayList<Integer> mark = new ArrayList<Integer>();
        for (int i = 0; i < element; i++) {
            int a = (int) (Math.random() * 10 + 1);
            mark.add(a);
        }
        System.out.println(mark);

        Object[] st = mark.toArray();
        for (Object s : st) {
            if (mark.indexOf(s) != mark.lastIndexOf(s)) {
                mark.remove(mark.lastIndexOf(s));
            }
        }

        System.out.println("List " + mark);
    }
}

