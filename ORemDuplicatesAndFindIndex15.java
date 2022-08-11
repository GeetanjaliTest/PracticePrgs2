package ArrayPrg;

import java.util.ArrayList;
import java.util.Arrays;

public class ORemDuplicatesAndFindIndex15 {

    public static void main(String args[]){
        int[] arr= new int[]{1,9,8,7,8,9,1,2};
        //first remove duplicates
        removeDuplicates(arr);

    }

    public static void removeDuplicates(int[] a){
        int unique= a.length;
        for(int i=0; i<unique; i++){
            for(int j=i+1; j<unique; j++){
                if(a[i]==a[j]){
                    a[j]=a[unique-1];
                    unique--;
                    j--;
                }
            }
        }
        int[] array_unique= Arrays.copyOf(a, unique);
        System.out.println("After removing duplicates:");
        for(int i=0; i<array_unique.length; i++){
            System.out.println(array_unique[i]);
        }
        //to find index
        findIndex(array_unique,8);

    }

    public static void findIndex(int[] a, int element){
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0 ;i<a.length; i++){
            al.add(a[i]);
        }
        System.out.println("Index of element:"+ element+ " is " + al.indexOf(element));
    }

}
