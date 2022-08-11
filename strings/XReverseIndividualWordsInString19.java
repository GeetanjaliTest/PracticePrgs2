package stringPractice;
//p23
//Reverse individual words
public class XReverseIndividualWordsInString19 {

    public static void main(String args[]){
        String str="This is my class";
        System.out.println(makeReverse(str));
    }

    public static String makeReverse(String s){
        StringBuffer sb= new StringBuffer(s);
        String str1= sb.reverse().toString();

        return str1;

    }
}
