# IT.Academy
first repository
public class E {
    public static void main(String[] args) {
        int  m [][]  = new int[5][];


        m[0] = new int[]{1, 1, 1, 1, 1};
        m[1] = new int[]{0, 1, 1, 1, 0};
        m[2] = new int[]{0, 0, 1, 0, 0};
        m[3] = new int[]{0, 1, 1, 1, 0};
        m[4] = new int[]{1, 1, 1, 1, 1};

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(" " + m[i][j] + " ");
            }
            System.out.println();
        }
    }
}
