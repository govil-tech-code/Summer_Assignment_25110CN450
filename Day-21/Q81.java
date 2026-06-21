// Write a program to Find string length without strlen()...

public class Q81 {
    public static void main(String[] args) {
        String str = "Hello";
        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
            System.out.println("Length = " + count);
        }
    }
}
