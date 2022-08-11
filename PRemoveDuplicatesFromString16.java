package ArrayPrg;

import java.util.Arrays;

public class PRemoveDuplicatesFromString16 {
        public static void main(String args[]){
            char[] str="dahdgahf".toCharArray();
            int n= str.length;
            System.out.println(removeDuplicates(str,n));
        }
        public static String removeDuplicates(char[] str, int n){
            int index =0;
            for(int i=0; i<n; i++){
                int j;
                for(j=0; j<i; j++){
                    if(str[i]==str[j]){
                        break;
                    }
                }
                if(j==i)
                    str[index++]=str[i];
            }
            return String.valueOf(Arrays.copyOf(str,index));
        }
    }
