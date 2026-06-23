// Write a program to Find First Non-Repeating Character

public class Q89 {
    public static void main(String[] args) {
     String str = "swiss";
     for (int i = 0; i < str.length(); i++) {
         int count = 0;
        for (int j = 0; j < str.length(); j++) {
          if (str.charAt(i) == str.charAt(j)) {
            count++;
                }
            }
            if (count == 1) {
        System.out.println("First Non-Repeating Character: " + str.charAt(i));
              return;
            }
        }
        System.out.println("No Non-Repeating Character Found");
    }
}