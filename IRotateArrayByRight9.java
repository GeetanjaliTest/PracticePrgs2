package ArrayPrg;

public class IRotateArrayByRight9 {
    public static void main(String args[]){
        int[] arr= new int[]{3,5,6,7,8};
        rotateByRight(arr);
    }
    public static void rotateByRight(int[] a){
        int n=3;
        for(int i=0; i<n; i++){
            int j,last;
            last= a[a.length-1];
            for(j= a.length-1; j>0;j--){
                a[j]=a[j-1];
            }
            a[0]=last;
        }
        System.out.println("Elements after right rotate");
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }

    }
}
