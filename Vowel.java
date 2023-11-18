import java.util.*;
Class Vowel{
    void vowels(String s){
        int count=0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if((ch == 'a' || ch == 'A') || (ch == 'e' || ch == 'E' )||( ch == 'i' || ch == 'I') || (ch == 'o' || ch == 'O' )||( ch == 'u' || ch == 'U'))
                count++;
        }
        System.out.println("Number of vowels are:" +count);
    }
    public static void main(String args[]){
    Vowel obj = new Vowel();     // creating the object of a class coz we need to call the method of a class
    Scanner sc = new Scanner(System.in);     // scanner class object
    String s = sc.nextLine();    // input the string
    obj.vowels();    // calling the method
    return 0;

}
}