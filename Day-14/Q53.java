// Write a program to Linear search.

public class Q53 {
    public static void linear_search(int numbers[], int key) {
        int start=0;
        int end = numbers.length-1;
       for(int i=start; i<=end; i++) {
        if(key==numbers[i]) {
            System.out.print("key is found at index : " +i);
            return;
        } 
       }
       System.out.print("Not found");
    }
    public static void main(String[] args) {
        int numbers[]={2,6,4,5,8,0,9};
        int key=5;
        linear_search(numbers,key);
    }
}