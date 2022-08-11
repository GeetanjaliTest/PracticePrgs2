package stringPractice;

public class LRCountNumberofWords12 {
    public static void main(String args[]){
        String str="     My name is Chinmai Kallepalli";
        countWords(str);
    }

    public static void countWords(String str){
        String frmatStr= str.trim();
       // System.out.println(frmatStr);
        String[] arrOfStr = frmatStr.split(" ", -1);
        int c=0;
        for ( int i=0; i<arrOfStr.length; i++) {

            c=c+1;
            System.out.println(arrOfStr[i]);
        }
        System.out.println("count of words:"+c);
    }
}
