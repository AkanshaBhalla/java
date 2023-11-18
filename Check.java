/*Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.*/
import java.util.*;
class Check{
    public static void main(String ags[]){
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[20];
        System.out.println("enter the element of an array:");
        for(int i=0;i<arr.length;i++){
             arr[i]= sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                System.out.println("number is positive:"+arr[i]);
            }
            else if(arr[i]<0){
                System.out.println("number is negative:"+arr[i]);
            }
            else if(arr[i]%2==0){
                System.out.println("number is even:"+arr[i]);
            }
            else{
                System.out.println("number is odd:"+arr[i]);
            }
        }
    }
}