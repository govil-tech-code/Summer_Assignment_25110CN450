// Write a program to Second largest element. 

public class Q55{
    public static void largest_element(int numbers[]) {
        int MAX1 = Integer.MIN_VALUE;
        int MAX2 = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(MAX1 < numbers[i]) {
                MAX2=MAX1;
               MAX1 = numbers[i];
            } else if(MAX2<numbers[i] && numbers[i]!=MAX1) {
                MAX2=numbers[i];
            } 
        }
        System.out.print("second largest element : " +MAX2);
    }
    public static void main(String[] args) {
        int numbers[]={2,4,1,6,9,8,7};
        largest_element(numbers);
    }
}
