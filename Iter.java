package Collect;

import sun.plugin2.message.MarkTaintedMessage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Iter {
    public static void main(String[] args) {
        int element = 10;
        ArrayList<Integer> mark = new ArrayList<Integer>();
        for (int i = 0; i < element; i++) {
            int a = (int) (Math.random() * 10 + 1);
            mark.add(a);
        }
        System.out.println(mark);
        int max = mark.get(0);
        int x = 1;
        Iterator<Integer> numbers = mark.iterator();
        while (x > 0) {
            for (int i = 0; i < mark.size(); i++) {
                if (max < mark.get(i)) {
                    max = mark.get(i);
                }
            }
            x--;
            System.out.println("Maximum value "+ max);
        }
    }
}
