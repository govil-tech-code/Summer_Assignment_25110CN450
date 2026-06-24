// Write a program to Find longest word.

public class Q95 {
    public static void main(String[] args) {
        String str = "I am a student of GLBITM COLLEGE";

        String[] words = str.split(" ");
        String longest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longest.length()) {
                longest = words[i];
            }
        }
        System.out.println("Longest Word: " + longest);
        System.out.println("Length: " + longest.length());
    }
}