package ArrayPrg;

public class SSearchElementInSortedArrayBinarySearch18 {
    public static void main(String args[]){
        int[] arr={5,8,9,6,7,8};
        int n=arr.length-1;
        int key=9;
        System.out.println("Index:"+ binarySearch(arr,0,n,key));
    }
    public static int binarySearch(int[] arr, int low, int high, int key){
        if(high < low){
            return -1;
        }
        int mid=(low+high)/2;
        if(key== arr[mid])
            return mid;
        if(key> arr[mid+1])
            return binarySearch(arr,(mid+1), high,key);
        return  binarySearch(arr,low, (mid+1),key);
    }
}
