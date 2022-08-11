package ArrayPrg;

public class DPrintArray4 {
    public static void main(String args[]){
        int[] arr= new int[]{1,2,3,4,5};
        printArray(arr);
    }

    public static void printArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
