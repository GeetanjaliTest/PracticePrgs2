//p1
//Program to copy all elements of one array into another array
//o [] {
package ArrayPrg;

public class Arraycopy1 {

    public static void main(String args[]){
        int[] arr1= new int[]{1,2,3,4,5,8};
        int[] arr2= new int[arr1.length];
        copyArray(arr1,arr2);

    }

    public static void copyArray(int[] arrF, int[] arrT){
        for (int i=0; i<arrF.length; i++){
            arrT[i]=arrF[i];
        }

        for (int i=0; i<arrT.length; i++){
            System.out.println(arrT[i]);
        }

    }
}
