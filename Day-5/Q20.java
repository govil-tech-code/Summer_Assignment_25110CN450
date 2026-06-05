import java.util.Scanner;
public class Q20 {
public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
     int largest = -1;

    for (int i = 2; i <= n; i++) {
      if (n % i == 0) { // factor

     boolean isPrime = true;
        for (int j = 2; j < i; j++) {
         if (i % j == 0) {
            isPrime = false;
              break;   }
                }
        if (isPrime) {
          largest = i;
               }
         }
        }
        System.out.println("Largest Prime Factor = " + largest);

        sc.close();
    }
}