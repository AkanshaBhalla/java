import java.util.Scanner;
Class Word{
    Public static void main(String args[]){
        Word obj = new Word();
        Scanner sc = new Scanner();
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        obj.num();

    }
    void num(String s){
        int count=1;
        for(int i=0;i<s.length();i++){
            int c ,d;
            c=s.charAt(i);
            d=s.charAt(i+1);
                if(c == ' ' && d!=' '){
                count++;
              }

        }

    }
    System.out.println(count);
    
}