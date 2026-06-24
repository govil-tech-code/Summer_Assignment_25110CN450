// Write a program to Check string rotation.....

public class Q93 {
    public static void main(String[] args) {
        String str1 = "ABCD";
        String str2 = "CDAB";

        if (isRotation(str1, str2)) {
            System.out.println("Strings are rotations of each other.");
        } else {
            System.out.println("Strings are not rotations of each other.");
        }
    }

    public static boolean isRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String temp = str1 + str1;
        return temp.contains(str2);
    }
}