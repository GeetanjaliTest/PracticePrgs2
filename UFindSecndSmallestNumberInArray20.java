package ArrayPrg;

import java.util.Arrays;

public class UFindSecndSmallestNumberInArray20 {
    public static void main(String args[]){
        int[] numArr={12,89,45,67,78};
        System.out.println(secondSmallestElement(numArr));
    }

    public static int secondSmallestElement(int[] numArr){
        Arrays.sort(numArr);
        return numArr[1];
    }
}
