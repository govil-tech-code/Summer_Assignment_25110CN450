// Write a program to Compress a string. 

public class Q94 {
    public static void main(String[] args) {
        String str = "aaabbccccd";

        String compressed = "";
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
      while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
          count++;
             i++;
            }
            compressed += str.charAt(i);
            compressed += count;
            count = 1;
        }
        System.out.println("Compressed String: " + compressed);
    }
}