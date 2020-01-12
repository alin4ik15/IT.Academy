public class task20 {

        public static void main(String[] args) {
            String s = "How are you?";
            s = s.replaceAll("[!.,:;-]", "");

            String[] words = s.split(" ");
            StringBuilder newS = new StringBuilder();

            for(String word : words) {
                newS.append(word.charAt(word.length()-1));
            }

            System.out.println(newS);
        }
    }


