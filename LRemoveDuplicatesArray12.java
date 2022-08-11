package ArrayPrg;

import java.util.Arrays;

public class LRemoveDuplicatesArray12 {
    public static void main(String args[]){
        int[] arr= new int[]{7,7,9,8,9,6,5};
        removeDuplicate(arr);
    }
    public static void removeDuplicate(int[] a){
        int unique=a.length;

        for(int i=0; i<unique; i++){
            for(int j=i+1; j<unique; j++){
                if(a[i]==a[j]){
                    a[j]=a[unique-1];
                    unique--;
                    j--;
                }
            }
        }

        int[] unique_arr= Arrays.copyOf(a,unique);
        System.out.println("after removing duplicates");

        for(int i=0; i<unique_arr.length; i++){
            System.out.println(unique_arr[i]);
        }
    }
}