// Write a program to Sort words by length...

public class Q100 {
    public static void main(String[] args) {
        String words[] = {"apple", "cat", "elephant", "dog", "bat"};

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].length() > words[j].length()) {
                    String temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        System.out.println("Words sorted by length:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}