package ArrayPrg;

public class GPrintAtOddPosition7 {
    public static void main(String args[]){
        int[] arr = new int[] {8,9,7,9,5,6,5};
        printAtOdd(arr);
    }
    public static void printAtOdd(int[] arr){
        for(int i=1; i<arr.length; i=i+2){
            System.out.println("Elements at odd position:"+i);
            System.out.println(arr[i]);
        }
    }
}
