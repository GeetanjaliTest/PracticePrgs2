package ArrayPrg;

import java.util.ArrayList;

public class NfindIndexUsingArrayList14 {
    public static void main(String args[]){
        int[] arr= new int[]{4,9,8,0,8,3};
        System.out.println(findIndex(arr,8));
    }
    public static int findIndex(int[] a, int t){
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0; i<a.length;i++){
            al.add(a[i]);
        }
        return al.indexOf(t);
    }
}
