package ArrayPrg;

public class KArraySort11 {
    public static void main(String args[]){
        int[] arr= new int[]{1,5,1,9,0,19,7,5-1,-2};
        sortArray(arr);
    }
    public static void sortArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
            System.out.println(a[i]);

        }
    }}
