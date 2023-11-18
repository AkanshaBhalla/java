//. two methods to print the maximum and the minimum number respectively among three numbers entered by user.

import java.util.*;
Class Main{
    public static void main(String args[]){
    cal obj= new cal();
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    System.out.println("maximum"+obj.max(a,b,c));
    System.out.println("maximum"+obj.min(a,b,c));
    }
    
    class cal{
        int max(int a , int b,int c){
            int maxi=a;
            if(b>maxi){
                maxi=b;
            }
            if(c>maxi){
                maxi=c;
            }
            return maxi;
        }
        int min(int a , int b , int c){
            int mini=a;
            if(b<mini){
                mini=b;
            }
            if(c<mini){
                mini=c;
            }
            return mini;
        }
    }
}