// Write a program to Sort names alphabetically...

public class Q99 {
    public static void main(String[] args) {
        String names[] = {"Rahul", "Aman", "Vikas", "Deepak", "Karan"};

        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println("Names in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}