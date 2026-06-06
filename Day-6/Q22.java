public class Q22 {
    public static void Binary_to_decimal(int binary) {
   int decimal=0;
    int pow=0;
   while(binary>0) {
   int rem=binary%10;
   decimal=decimal+rem*(int)Math.pow(2,pow);
   pow++;
   binary=binary/10;
   }
System.out.println(decimal);
    }
    public static void main (String[] args) {
        Binary_to_decimal(11101);
    }
}
