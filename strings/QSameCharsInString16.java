//p16
//Recursion is the technique of making a function call itself. This technique provides a
// way to break complicated problems down into simple problems which are easier to solve.
//Check whether two strings contain same characters in same order
package stringPractice;

public class QSameCharsInString16 {
    public static void main(String args[]){
        String s1="Geeeks";
        String s2="Geks";

        if(CheckSequence(s1,s2)) {
            System.out.println("same chars");
        }
            else {
            System.out.println("no same chars");
        }
    }

    public static boolean CheckSequence(String a, String b) {
        if (b.length() == 0)
            return true;

        if (a.length() == 0)
            return false;

            if (a.charAt(0) == b.charAt(0)) {
                return CheckSequence(a.substring(1), b.substring(1));
            } else {
                return CheckSequence(a.substring(1), b);
            }
        }
    }

