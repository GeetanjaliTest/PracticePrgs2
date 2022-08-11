//p17
//Count of substrings of length K with exactly K distinct characters
//https://www.geeksforgeeks.org/set-in-java/
package stringPractice;

import java.util.HashSet;
import java.util.Set;

public class RRFindSubstringLenKwithKdistinctChars17 {

    public static void main(String args[]){
        String str="abcadce";
        int k=4;

        Set<String> result= findDistinctSubString(str,k);
        System.out.println(result);
    }

    public static Set<String>
    findDistinctSubString(String str, int k){

        Set<String> result = new HashSet<>();

        if(str == null){

            return result;
        }
        for (int i=0; i< str.length()-k+1; i++){
            Set<Character> chars= new HashSet<>();
            System.out.println(str.charAt(i));
            //System.out.println(chars.add(str.charAt(i)));
            for (int j=i; j < str.length() && chars.size() <=k ;j++) {
                System.out.println(str.charAt(j));
               chars.add(str.charAt(j));
                System.out.println(chars);
                if(chars.size()==k){
                   result.add(str.substring(i,j+1));
                }
           }
        }
        return result;
    }
}
