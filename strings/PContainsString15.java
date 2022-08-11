//p15
//Read two String user input and check if first contains second
package stringPractice;

import java.util.Scanner;

public class PContainsString15 {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);

        System.out.println("Enter first string:");
        String s1= in.nextLine();

        System.out.println("Enter 2nd string:");
        String s2= in.nextLine();

        System.out.println(CheckIfContains(s1,s2));

    }

    public static boolean CheckIfContains(String s1, String s2){

        if(s1.contains(s2)){
            return true;

        }

        return false;
    }
}
