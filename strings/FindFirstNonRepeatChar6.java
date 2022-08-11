package stringPractice;

//p6
//o [] {
//Find first non repeated character in a String
public class FindFirstNonRepeatChar6 {

    public static void main(String args[]){

        System.out.println("The first non repeated character in print:"+ getFirstNonRepeatedCharacter("print"));
        System.out.println("The first non repeated character in easiest:"+ getFirstNonRepeatedCharacter("easiest"));

    }

    public static Character getFirstNonRepeatedCharacter(String str){

        //char[] strArr= str.toCharArray();
        for (int i=0; i< str.length(); i++){

            if(str.lastIndexOf(i)==str.indexOf(i)){
                return str.charAt(i);
            }
        }
        return null;
    }
}
