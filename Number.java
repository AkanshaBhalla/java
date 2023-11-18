import java.util.Scanner;
class Number{

    static int average(int a , int b ,int c){
        int total=a+b+c;
        int s=total/3;
        return s;
    }

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first number");
    int a = sc.nextInt();
    System.out.println("enter the second number");
    int b = sc.nextInt();
    System.out.println("enter the third number");
    int c = sc.nextInt();
    System.out.println("The average is "+ average( a , b, c));
 
}
}