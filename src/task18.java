public class task18 {

        public static void main(String[] args) {
            String s ="Winter, time for miracles!!!";
            char [] c={'.',',','-',':',';','?','!'};
            int count = 0;
            for(int i=0;i<s.length();i++){
                for(int j=0;j<c.length;j++){
                    if(s.charAt(i)==c[j]){
                        count++;
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }

