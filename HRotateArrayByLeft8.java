package ArrayPrg;

public class HRotateArrayByLeft8 {
    public static void main(String args[]){
          int [] arr= new int[] {2,3,4,5,6};
          rotateByLeft(arr);
    }
    public static void rotateByLeft(int[] arr){
        int n=3;
        for(int i=0; i<n; i++){
            int j, first;
            first=arr[0];
            for(j =0; j<arr.length-1; j++){
                arr[j]=arr[j+1];
            }
            arr[j]= first;
        }
        System.out.println("Array after left rotation");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
