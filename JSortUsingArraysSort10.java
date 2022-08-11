package ArrayPrg;

import java.util.Arrays;

public class JSortUsingArraysSort10 {
    public static void main(String args[]){
        int[] a= new int[]{2,5,1,7,83,4};
        sortArray(a);
    }
    public static void sortArray(int[] a){
        Arrays.sort(a);
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
    }
}
