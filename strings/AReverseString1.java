public class AReverseString1 {
    public static void main(String args[]){
        String str="chinmai";
        String rev="";
        for (int i=str.length()-1; i>=0; i--){
            rev= rev + str.charAt(i);}
        System.out.println("The reverse string is:"+ rev);}}

public class BBRevStringUsingStringBuffer2 {
    public static void main(String args[]){
        String str= "My name is Chinmai";
        StringBuffer sb = new StringBuffer(str);
        System.out.println("Reverse string:"+ sb.reverse());}}

public class CCheckAnagram3 {
    public static void main(String args[]){
        String word = "Chinmai2US";
        String anagram = "USChinmai2";
        System.out.println("Chinmai2US and USChinmai2 are anagrams:"+ isAnagramUsingArraySort(word, anagram));}
    public static boolean isAnagramUsingArraySort(String word, String anagram){
        String sortedWord= sortChars(word);
        String sortedanagram= sortChars(anagram);
        return sortedWord.equals(sortedanagram);}
    public static String sortChars(String word){
        char[] wordArr= word.toLowerCase().toCharArray();
        Arrays.sort(wordArr);
        return String.valueOf(wordArr);}}

public class DDCheckUniqueChars4 {
    public static void main(String args[]){
        System.out.println("Java2blog has all unique characters:"+ hasAllUniqueChars("Java2blog"));
        System.out.println("index has all unique characters:"+ hasAllUniqueChars("index"));}
    public static boolean hasAllUniqueChars(String str){
        HashSet hs= new HashSet();
        for(int i=0; i<str.length(); i++){
            char c= str.charAt(i);
            System.out.println(c);
            if(!hs.add(c)){return false;}}
        return true;}}

public class EFindDuplicateChars5 {
    public static void main(String args[]){
        String str="geeksforgeeks";
        countDuplicateChars(str);}
    public static void countDuplicateChars(String str){
        Map<Character, Integer> map= new HashMap<Character, Integer>();
        char[] strArr = str.toCharArray();
        for (char c: strArr){
            if(map.containsKey(c)){
                map.put(c, map.get(c)+1);} else {
                map.put(c,1);}}
        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + ":"+ entry.getValue());}}}}

public class FindFirstNonRepeatChar6 {
    public static void main(String args[]){
        System.out.println("The first non repeated character in print:"+ getFirstNonRepeatedCharacter("print"));
        System.out.println("The first non repeated character in easiest:"+ getFirstNonRepeatedCharacter("easiest"));}
    public static Character getFirstNonRepeatedCharacter(String str){
        for (int i=0; i< str.length(); i++){
            if(str.lastIndexOf(i)==str.indexOf(i)){return str.charAt(i);}}
        return null;}}

public class GSubstringsOfString7 {
public static void main(String args[]){
        String str="abbcc";
        for (int i=0; i< str.length(); i++){
            for (int j=i+1; j< str.length(); j++){
                System.out.println(str.substring(i,j));}}}}

class HFindStringLen8 {
    public static void main(String args[]) {
    String helloWorld = "This is hello world";
        System.out.println("length of helloWorld string :" + getLengthOfStringWithCharArray(helloWorld));}
    public static int getLengthOfStringWithCharArray(String str) {
        int length = 0;
        char[] strCharArray = str.toCharArray();
        for (char c : strCharArray) {length++;}
        return length;}}

public class ICheckPalindrome9 {
    public static void main(String args[]){
        checkPalindromeString("mam");
        checkPalindromeString("test");}
public static void checkPalindromeString(String str){
        boolean result = true;
        for (int i=0; i< str.length()/2; i++){
            if(str.charAt(i)!= str.charAt(str.length()-i-1)){
                result= false;
                break;}}
        System.out.println(str+ " is palindrome="+ result);}}


public class JRemoveCharFromString10 {
    public static void main(String args[]){
        remCharacterFrmString("abcdef", 'e');}
    public static void remCharacterFrmString(String str, char c){
        String result = str.replaceAll(String.valueOf(c),"");
        System.out.println(result);}}

public class KStringImmutable11 {
        public static void main(String args[]){
        String s1= "Java";
        String s2=s1;
        System.out.println(s1==s2);
        s1="Python";
        System.out.println(s1==s2);
        System.out.println(s2);}}


public class LRCountNumberofWords12 {
    public static void main(String args[]){
        String str="     My name is Chinmai Kallepalli";
        countWords(str);}
    public static void countWords(String str){
        String frmatStr= str.trim();
        String[] arrOfStr = frmatStr.split(" ", -1);
        int c=0;
        for ( int i=0; i<arrOfStr.length; i++) {
            c=c+1;
            System.out.println(arrOfStr[i]);}
        System.out.println("count of words:"+c);}}

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
            System.out.println("They are not same");}}}

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
        System.out.println("Strings swap"+" a= "+ a);}}

public class PContainsString15 {
    public static void main(String args[]){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter first string:");
        String s1= in.nextLine();
        System.out.println("Enter 2nd string:");
        String s2= in.nextLine();
        System.out.println(CheckIfContains(s1,s2));}
    public static boolean CheckIfContains(String s1, String s2){
        if(s1.contains(s2)){
            return true;}
        return false;}}

public class QSameCharsInString16 {
    public static void main(String args[]){
        String s1="Geeeks";
        String s2="Geks";
        if(CheckSequence(s1,s2)) {
            System.out.println("same chars");} else{
            System.out.println("no same chars");}}
    public static boolean CheckSequence(String a, String b) {
        if (b.length() == 0)
            return true;
        if (a.length() == 0)
            return false;
        if (a.charAt(0) == b.charAt(0)) {
                return CheckSequence(a.substring(1), b.substring(1)); } else {
                return CheckSequence(a.substring(1), b);}}}

public class RRFindSubstringLenKwithKdistinctChars17 {
    public static void main(String args[]){
        String str="abcadce";
        int k=4;
        Set<String> result= findDistinctSubString(str,k);
        System.out.println(result);}
    public static Set<String>
    findDistinctSubString(String str, int k){
        Set<String> result = new HashSet<>();
        if(str == null){return result;}
        for (int i=0; i< str.length()-k+1; i++){
            Set<Character> chars= new HashSet<>();
            for (int j=i; j < str.length() && chars.size() <=k ;j++) {
               chars.add(str.charAt(j));
                if(chars.size()==k){
                   result.add(str.substring(i,j+1));}}}
        return result;}}

public class WCountNumberSubstringsKDistinctChars18 {
    public static void main(String args[]){
        String s="tetskkl";
        int k=3;
        System.out.println(countDistinctSubstring(s,k));}
    public static int countDistinctSubstring(String s, int k){
        int res=0;
        int n=s.length();
        boolean seen[]= new boolean[26];
        for (int i=0; i< n; i++){
            int disCnt=0;
            Arrays.fill(seen,false);
            for (int j=i; j<n ; j++){
                if(!seen[s.charAt(j)-'a'])
                    disCnt++;
                seen[s.charAt(j)-'a']=true;
                if(disCnt==k)
                    res++;}}
        return res;}}

public class XReverseIndividualWordsInString19 {
    public static void main(String args[]){
        String str="This is my class";
        System.out.println(makeReverse(str));}
    public static String makeReverse(String s){
        StringBuffer sb= new StringBuffer(s);
        String str1= sb.reverse().toString();
        return str1;}}

public class YReverseWordsInString20 {
    public static void main(String args[]){
        String s="This is chinmai";
        String[] strArr=s.split(" ");
        String rev=" ";
        for (int i=strArr.length-1; i>=0; i--){
            rev= rev+strArr[i]+" ";}
        System.out.println(rev);}}}

public class printFrequency {
    public static void main(String args[]){
        String s="HelooChinmai";
        printFequency(s);
    }public static void printFequency(String s){
        Map<Character,Integer> mp= new HashMap<Character,Integer>();
        for(int i=0; i<s.length();i++){
            if(mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
            } else {mp.put(s.charAt(i), 1);}}
        for(int i=0; i<s.length();i++){
            if(mp.get(s.charAt(i)) != 0){
                System.out.print(s.charAt(i)+ " "+ mp.get(s.charAt(i)) + " ");
                mp.put(s.charAt(i), 0);}}}}
