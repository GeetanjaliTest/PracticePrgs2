package stringPractice;

import java.util.Arrays;

//p3- Using Arrays.sort()
//o [] {
/*String s = "HELLO";
      char [] ch = s.toCharArray();*/
/*String is implemented to store sequence of characters and
 to be represented as a single data type and single entity.
 Character Array on the other hand is a sequential collection of data type
 char where each element is a separate entity.
 String internal implementation makes it immutable in nature.
 Char array is mutable in nature.
 String is class hence have built in fxns like charAt(), subString()
 */
public class CCheckAnagram3 {
    public static void main(String args[]){
        String word = "Chinmai2US";
        String anagram = "USChinmai2";

        System.out.println("Chinmai2US and USChinmai2 are anagrams:"+ isAnagramUsingArraySort(word, anagram));
    }

    public static boolean isAnagramUsingArraySort(String word, String anagram){

        String sortedWord= sortChars(word);
        String sortedanagram= sortChars(anagram);
        return sortedWord.equals(sortedanagram);
    }

    public static String sortChars(String word){

        char[] wordArr= word.toLowerCase().toCharArray();
        Arrays.sort(wordArr);
        return String.valueOf(wordArr);
    }
}

