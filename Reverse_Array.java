//Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.
import java.util.*;
class Reverse_Array{
        static void reverse(int[] arr){
            int i=0,j=arr.length-1;
            while(i<j){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j]=t;
                i++;
                j--;
            }
            public static void main(String args[]){
                int[] arr={2,4,6,8,10,12,24,20};
                for(int i=0;i<arr.length;i++){
                    System.out.println(arr[i]+" ");
                }
                reverse(arr);
                for(int i=0;i<arr.length;i++){
                    System.out.println(arr[i]+" ");
                }
            }
        }
    