// Write a program to Convert decimal to binary. 

public class Q21 {
 public static void Decimal_to_Binary(int decimal) {
int binary=0;
int space=1;
while(decimal>0)  {
   binary=binary+decimal%2*space;
   space=space*10;
   decimal=decimal/2;
}
   System.out.println(binary);
 }
public static void main(String[] args) {
    Decimal_to_Binary(29);
}
}