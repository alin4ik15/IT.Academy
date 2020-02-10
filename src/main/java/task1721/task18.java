package task1721;

public class task18 {

    public static void main(String[] args) {
        String s = "Winter, time for miracles!!!";
        char[] c = {'.', ',', '-', ':', ';', '?', '!'};
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (char value : c) {
                if (s.charAt(i) == value) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

