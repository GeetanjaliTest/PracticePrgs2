package stringPractice;

//p7
//Find all substrings of String in java
public class GSubstringsOfString7 {

    public static void main(String args[]){
        String str="abbcc";
        for (int i=0; i< str.length(); i++){
            for (int j=i+1; j< str.length(); j++){
                System.out.println(str.substring(i,j));

            }
        }
    }
}
