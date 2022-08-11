package stringPractice;

import java.util.HashSet;

//p4 //o [] {
//How to check if String has all unique characters in java
/*HashSet is a class that extends AbstractSet and implements the Set interface in Java.
 It is a very useful tool that allows you to store unique items and access them in constant time (on average).
 No duplicate values are stored.
 */
public class DDCheckUniqueChars4 {
    public static void main(String args[]){
        System.out.println("Java2blog has all unique characters:"+ hasAllUniqueChars("Java2blog"));
        System.out.println("apple has all unique characters:"+ hasAllUniqueChars("apple"));
        System.out.println("index has all unique characters:"+ hasAllUniqueChars("index"));
        System.out.println("print has all unique characters:"+ hasAllUniqueChars("print"));
    }

    public static boolean hasAllUniqueChars(String str){
        HashSet hs= new HashSet();
        for(int i=0; i<str.length(); i++){

            char c= str.charAt(i);
            System.out.println(c);
            if(!hs.add(c)){
                return false;
            }

        }

        return true;
    }
}
