// Write a program to Find common characters in strings...

public class Q98 {
    public static void main(String[] args) {
        String str1 = "college";
        String str2 = "courage";
        for(int i=0; i<str1.length(); i++) {
            char ch = str1.charAt(i);
             boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (str1.charAt(k) == ch) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) {
                continue;
            }
            
            for(int j=0; j<str2.length(); j++) {
                if(ch==str2.charAt(j)) {
                    System.out.print(ch+" ");
                    break;
                }
            }
        }
    }
}