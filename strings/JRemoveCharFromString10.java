package stringPractice;

//p10
//How to remove all occurrences of a given character from input String
//o [] {
public class JRemoveCharFromString10 {

    public static void main(String args[]){
        remCharacterFrmString("abcdef", 'e');
    }

    public static void remCharacterFrmString(String str, char c){

        String result = str.replaceAll(String.valueOf(c),"");
        System.out.println(result);

    }
}
