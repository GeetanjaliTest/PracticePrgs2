package stringPractice;

//p1-Java program to reverse a String
//o [] {
public class AReverseString1 {
    public static void main(String args[]){
        String str="chinmai";
        String rev="";
        for (int i=str.length()-1; i>=0; i--){
            //System.out.println(str.length());
            //System.out.println("Index:"+ i+ str.charAt(i));
            rev= rev + str.charAt(i);
        }
        System.out.println("The reverse string is:"+ rev);
    }
}


