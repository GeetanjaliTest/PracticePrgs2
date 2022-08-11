package stringPractice;

//p9
//How to check if a String is Palindrome


public class ICheckPalindrome9 {
    public static void main(String args[]){
        checkPalindromeString("aba");
        checkPalindromeString("mam");
        checkPalindromeString("test");
    }

    public static void checkPalindromeString(String str){

        boolean result = true;
        for (int i=0; i< str.length()/2; i++){
            System.out.println(str.charAt(i));
            System.out.println(str.charAt(str.length()-i-1));
            if(str.charAt(i)!= str.charAt(str.length()-i-1)){
                result= false;
                break;
            }
        }
        System.out.println(str+ " is palindrome="+ result);
    }
}
