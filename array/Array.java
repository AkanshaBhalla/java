
//Take 10 integer inputs from user and store them in an array and print them on screen.
import java.util.*;
class Array{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        int [] arr=new int[10];
        System.out.println("enter the no of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<arr.length;i++){
        System.out.println("elements of an array:"+arr[i]);
        }
        
    }
   
}