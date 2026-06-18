// Write a program to Bubble sort....

public class Q69 {
    public static void main(String[] args) { 
       
        int num[]= {3,9,2,5,7,1,6,4};
       
        for (int i = 0; i < num.length-1; i++) {
            for(int j=0; j<num.length-i-1; j++) {
                if(num[j]>num[j+1]) {
                  int temp=num[j];
                  num[j]=num[j+1];
                  num[j+1]=temp;
                }
            }
        }
        System.out.print("sorted array : ");
        for(int i=0; i<num.length; i++) {
            System.out.print(" "+num[i]+" ");
        }
    }

}