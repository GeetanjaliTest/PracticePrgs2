package stringPractice;
//p22
//Reverse words in a given string
public class YReverseWordsInString20 {

    public static void main(String args[]){
        String s="This is chinmai";
        String[] strArr=s.split(" ");
        String rev=" ";
        for (int i=strArr.length-1; i>=0; i--){
            rev= rev+strArr[i]+" ";
        }
        System.out.println(rev);

    }
}
