package ArrayPrg;

public class CFindDuplicates3 {
    public static void main(String args[]){
        int[] arr= new int[]{8,9,0,1,8,9,7};
        findDuplcates(arr);
    }
    public static void findDuplcates(int arr[]){
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]==arr[j])
                {
                    System.out.println("Duplicates are:"+ arr[j]);
                }
            }
        }
    }
}
