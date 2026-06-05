public class Q16 {
    public static void armstrong(int n) {
        for (int i = 1; i <= n; i++) {
            int temp = i;
            int digit = 0;
            int sum = 0;
            while (temp > 0) {
                digit++;
                temp = temp / 10;
            }
            temp = i;
            while (temp > 0) {
                int rem = temp % 10;
                sum = sum + (int) Math.pow(rem, digit);
                temp = temp / 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        armstrong(1000);
    }
}