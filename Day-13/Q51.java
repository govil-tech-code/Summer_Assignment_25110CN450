// Write a program to find a largest and smallest element...

public class Q51 {
    public static void array(int num[]) {
       int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;
       for(int i=0; i<num.length; i++) {
        if(largest<num[i]) {
            largest=num[i];
        }
        if(smallest>num[i]) {
            smallest=num[i];
        }
       }
       System.out.println("Largest element : " +largest);
        System.out.println("Smallest element : " +smallest);
    }
    public static void main(String[] args) {
    int num[]={1,3,2,9,5,7};
    array(num);
}
}