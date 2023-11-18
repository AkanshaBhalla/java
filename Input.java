//Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.
import java.util.*;
class Input{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        int [] arr=new int[10];
        System.out.println("enter the no of array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        System.out.println("again ask user to enter the number:");
        int b;
        b=s.nextInt();
        for(int i=0;i<arr.length;i++){
        if(b==arr[i]){
            System.out.println("the number is peresent in the array");
        }
        //System.out.println("the number is not persent in the array");
        }
    }
}
