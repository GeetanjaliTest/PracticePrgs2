package ArrayPrg;

import java.util.Arrays;

public class MFindIndexElementArray13 {

    public static void main(String args[]){
        int[] arr= new int[]{6,7,9,0,1,90,3,24};
        Arrays.sort(arr);
        for (int i=0; i< arr.length; i++)
            System.out.println(arr[i]);
        System.out.println("Index 9:"+ findIndex(arr,9));
        System.out.println("Index 3:"+ findIndex(arr,3));
    }

    public static int findIndex(int[] a, int t){

        int index= Arrays.binarySearch(a,t);
        return (index < 0) ?-1 : index;


    }
}
