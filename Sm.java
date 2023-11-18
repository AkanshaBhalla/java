import java.util.Scanner;
class Sm{ 
      static int small( int a, int b, int c){
    if(a<=b && b<=c)
        System.out.println(a);
    else if(b<=a && b<=c)
        System.out.println(b);
    else
         System.out.println(c);
         return 1;
    }
    
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    int a = sc.nextInt();
    System.out.println("enter the second number");
    int b = sc.nextInt();
    System.out.println("enter the third number");
    int c = sc.nextInt();
    System.out.println("The smallest value is "+ small( a , b, c));
 
}

}