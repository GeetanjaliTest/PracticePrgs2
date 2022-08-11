package ArrayPrg;

import java.util.Arrays;

public class Prac1 {
    public static void main(String args[]){
        int[] numArr={3,45,67,8,90,19,80,900,78,56,45,6,78,9,11};
        findTenthLargest(numArr);
    }
    public static void findTenthLargest(int[] numArr){
        //remove duplicates first
        int[] u_array= removeDuplicates(numArr);
        System.out.println("After sorting again");
        for (int i=0; i<u_array.length; i++){
            System.out.println(u_array[i]);
        }
        System.out.println("Tenth :");
        //System.out.println(u_array.length);
        System.out.println(u_array[10]);
    }

    public static int[] removeDuplicates(int[] numArr){
        int unique= numArr.length;
        for(int i=0; i<unique; i++){
            for(int j=i+1; j<unique; j++){
                if(numArr[i]==numArr[j]){
                    numArr[j]=numArr[unique-1];
                    unique--;
                    j--;
                }
            }
        }
        int[] u_array= Arrays.copyOf(numArr,unique);
        for (int i=0; i<u_array.length; i++){
            System.out.println(u_array[i]);
        }
        Arrays.sort(u_array);
        System.out.println("After sorting");
        for (int i=0; i<u_array.length; i++){
            System.out.println(u_array[i]);
        }
        return u_array;

    }
}
