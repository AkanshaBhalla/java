//Define a program to find out whether a given number is even or odd.
import java.util.Scanner;
class Odd{
    public static void main(String args[]){
        Check1 obj = new Check1();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int a = sc.nextInt();
        obj.very(a);
    }
    class Check1{
        int very(int a){
            if(a%2==0)
                System.out.println(a+"is even");
            else
            System.out.println(a+"is odd");

        }
        
    }

}
