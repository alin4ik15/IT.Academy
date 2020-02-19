package main.java.task1721;

public class task20 {
    public static void main(String[] args) {

        int j = 0;
        String str = "Beat yourself and win thousands of battles.";
        char[] arrString = str.toCharArray();
        int wordQuantity = str.trim().split(" +").length;
        char[] arr1 = new char[wordQuantity - 1];
        for (int i = 0; i < arrString.length; i++) {
            if (arrString[i] == ' ') {
                arr1[j] = arrString[i - 1];
                j++;
            }
        }
        char lastSymbol = str.charAt(str.length() - 1);
        System.out.print(String.valueOf(arr1) + lastSymbol);
    }
}
