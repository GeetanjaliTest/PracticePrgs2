//p14
//Java Program to Swap two Strings Without Using any Third Variable
//p4 //o [] {
/*public String substring(int startIndex):
This method returns new String object containing the substring of the given string from specified startIndex (inclusive). The method throws an IndexOutOfBoundException when the startIndex is larger than the length of String or less than zero.
public String substring(int startIndex, int endIndex):
This method returns new String object containing the substring of the given string from specified startIndex to endIndex. The method throws an IndexOutOfBoundException when the startIndex is less than zero or startIndex is greater than endIndex or endIndex is greater than length of String.

 */
package stringPractice;

public class NSwapStrings14 {
    public static void main(String args[]){
        String a="Hi";
        String b="Chinmai";

        System.out.println("Strings before swapping:"+"a= "+ a +" b= "+ b);
        a= a + b;
        System.out.println("Strings appending"+" a= "+ a);
        b= a.substring(0, a.length()-b.length());
        System.out.println("Strings swap"+" b= "+ b);
        a=a.substring(b.length());
        System.out.println("Strings swap"+" a= "+ a);
    }
}
