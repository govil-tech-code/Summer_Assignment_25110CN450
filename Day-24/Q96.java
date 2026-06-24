// Write a program to Remove duplicate characters.

public class Q96 {
    public static void main(String[] args) {
        String str = "INTERNATIONAL";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (result.indexOf(ch) == -1) {
                result += ch;
            }
        }
        System.out.println("Original String: " + str);
        System.out.println("After Removing Duplicates: " + result);
    }
}