package ArrayPrg;


import java.util.Arrays;

public class TFindThirdLargestElement19 {
  public static void main(String args[]){
      int[] numArr={12,89,45,67,78};
      System.out.println(getThridLargestElement(numArr));
  }

  public static int getThridLargestElement(int[] numArr){
      Arrays.sort(numArr);
      return numArr[numArr.length-3];
  }

}
