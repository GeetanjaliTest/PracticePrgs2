package stringPractice;
//\n
import java.util.Scanner;

public class MCheckIf2StringsEqual13 {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);

        String s1= in.nextLine();
        System.out.println("Enter the first string:"+ s1);

        String s2= in.nextLine();
        System.out.println("Enter the second string:"+ s2);

        System.out.println("\n Are two strings equal");

        if(s1.equals(s2)){
            System.out.println("Yes they are same");
        } else {
            System.out.println("They are not same");
        }
    }
}
