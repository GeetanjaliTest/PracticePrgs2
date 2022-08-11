////p18
////Count number of substrings with exactly k distinct characters
package stringPractice;
//
import java.util.Arrays;

public class WCountNumberSubstringsKDistinctChars18 {

    public static void main(String args[]){
        String s="tetskkl";
        int k=3;
        System.out.println(countDistinctSubstring(s,k));
    }

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
                    res++;
            }
        }



        return res;
    }
}
