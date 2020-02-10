package task1721;

public class task19 {

    public static void main(String[] args) {

        String s = "How are you?";
        int count = 0;

        //тут какая-то уерунда.

        if (s.length() != 0) {
            count++;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ' ') {
                    count++;
                }
            }
        }

        System.out.println(count + "word");
    }
}
