public class task19 {

    public static void main(String[] args) {

        String s = "How are you?";
        //Начальное количество слов равно 0
        int count = 0;


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
