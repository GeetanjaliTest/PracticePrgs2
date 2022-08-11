package ArrayPrg;

public class FPrintEven6 {

    public static void main(String args[]){
        int[] arr= new int[]{1,2,3,4,5,5,6,7,8,9,10};
        printAteven(arr);
    }
    public static void printAteven(int[] arr){
        for(int i=0; i< arr.length; i=i+2){
            System.out.println("Elements at even position:"+i);
            System.out.println(arr[i]);
        }
    }
}
