public class Arraycopy1 {
    public static void main(String args[]){
        int[] arr1= new int[]{1,2,3,4,5,8};
        int[] arr2= new int[arr1.length];
        copyArray(arr1,arr2);}
    public static void copyArray(int[] arrF, int[] arrT){
        for (int i=0; i<arrF.length; i++){
            arrT[i]=arrF[i];}
        for (int i=0; i<arrT.length; i++){
            System.out.println(arrT[i]);}}}

public class BfrequencyElementInArray2 {
    public static void main(String args[]){
        int[] arr= new int[]{1,2,3,4,5,5,6,7,2};
        int[] fr= new int[arr.length];
        int visited=-1;
        for(int i=0; i< arr.length; i++){
            int count=1;
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    count++;
                    fr[j]=visited;}}
            if(fr[i]!=visited)
                fr[i]=count;}
        System.out.println("Element, frequency");
        for(int i=0; i<fr.length; i++)
        { if(fr[i]!=visited){
                System.out.println(" "+arr[i]+" "+fr[i]);}}}}

public class CFindDuplicates3 {
    public static void main(String args[]){
        int[] arr= new int[]{8,9,0,1,8,9,7};
        findDuplcates(arr);}
    public static void findDuplcates(int arr[]){
        for(int i=0; i< arr.length; i++){
            for(int j=i+1; j< arr.length; j++){
                if(arr[i]==arr[j])
                { System.out.println("Duplicates are:"+ arr[j]);}}}}}


public class DPrintArray4 {
    public static void main(String args[]){
        int[] arr= new int[]{1,2,3,4,5};
        printArray(arr);}
    public static void printArray(int[] arr){
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);}}}

public class EReversePrint5 {
    public static void main(String args[]){
        int[] arr= new int[]{1,2,3,4,5};
        printReverse(arr);}
    public static void printReverse(int[] arr){
        for(int i=arr.length-1; i>=0; i--)
        { System.out.println(arr[i]);}}}

public class FPrintEven6 {
    public static void main(String args[]){
        int[] arr= new int[]{1,2,3,4,5,5,6,7,8,9,10};
        printAteven(arr);}
    public static void printAteven(int[] arr){
        for(int i=0; i< arr.length; i=i+2){
            System.out.println("Elements at even position:"+i);
            System.out.println(arr[i]);}}}

public class GPrintAtOddPosition7 {
    public static void main(String args[]){
        int[] arr = new int[] {8,9,7,9,5,6,5};
        printAtOdd(arr);}
    public static void printAtOdd(int[] arr){
        for(int i=1; i<arr.length; i=i+2){
            System.out.println("Elements at odd position:"+i);
            System.out.println(arr[i]);}}}

public class HRotateArrayByLeft8 {
    public static void main(String args[]){
          int [] arr= new int[] {2,3,4,5,6};
          rotateByLeft(arr);}
    public static void rotateByLeft(int[] arr){
        int n=3;
        for(int i=0; i<n; i++){
            int j, first;
            first=arr[0];
            for(j =0; j<arr.length-1; j++){
                arr[j]=arr[j+1];}
            arr[j]= first;}
        System.out.println("Array after left rotation");
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);}}}


public class IRotateArrayByRight9 {
    public static void main(String args[]){
        int[] arr= new int[]{3,5,6,7,8};
        rotateByRight(arr);}
    public static void rotateByRight(int[] a){
        int n=3;
        for(int i=0; i<n; i++){
            int j,last;
            last= a[a.length-1];
            for(j= a.length-1; j>0;j--){
                a[j]=a[j-1];}
            a[0]=last;}
        System.out.println("Elements after right rotate");
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);}}}

public class JSortUsingArraysSort10 {
    public static void main(String args[]){
        int[] a= new int[]{2,5,1,7,83,4};
        sortArray(a); }
    public static void sortArray(int[] a){
        Arrays.sort(a);
        for(int i=0; i<a.length; i++){
            System.out.println(a[i]);}}}

public class KArraySort11 {
    public static void main(String args[]){
        int[] arr= new int[]{1,5,1,9,0,19,7,5-1,-2};
        sortArray(arr);}
    public static void sortArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;}}
            System.out.println(a[i]);}}}

public class LRemoveDuplicatesArray12 {
    public static void main(String args[]){
        int[] arr= new int[]{7,7,9,8,9,6,5};
        removeDuplicate(arr);}
    public static void removeDuplicate(int[] a){
        int unique=a.length;
        for(int i=0; i<unique; i++){
            for(int j=i+1; j<unique; j++){
                if(a[i]==a[j]){
                    a[j]=a[unique-1];
                    unique--;
                    j--;}}}
        int[] unique_arr= Arrays.copyOf(a,unique);
        System.out.println("after removing duplicates");
        for(int i=0; i<unique_arr.length; i++){
            System.out.println(unique_arr[i]);}}}


public class MFindIndexElementArray13 {
    public static void main(String args[]){
        int[] arr= new int[]{6,7,9,0,1,90,3,24};
        Arrays.sort(arr);
        for (int i=0; i< arr.length; i++)
            System.out.println(arr[i]);
        System.out.println("Index 9:"+ findIndex(arr,9));
        System.out.println("Index 3:"+ findIndex(arr,3));}
    public static int findIndex(int[] a, int t){
        int index= Arrays.binarySearch(a,t);
        return (index < 0) ?-1 : index;}}


public class NfindIndexUsingArrayList14 {
    public static void main(String args[]){
        int[] arr= new int[]{4,9,8,0,8,3};
        System.out.println(findIndex(arr,8));}
    public static int findIndex(int[] a, int t){
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0; i<a.length;i++){
            al.add(a[i]);}
        return al.indexOf(t);}}

public class ORemDuplicatesAndFindIndex15 {
    public static void main(String args[]){
        int[] arr= new int[]{1,9,8,7,8,9,1,2};
        //first remove duplicates
        removeDuplicates(arr);}
    public static void removeDuplicates(int[] a){
        int unique= a.length;
        for(int i=0; i<unique; i++){
            for(int j=i+1; j<unique; j++){
                if(a[i]==a[j]){
                    a[j]=a[unique-1];
                    unique--;
                    j--;}}}
        int[] array_unique= Arrays.copyOf(a, unique);
        System.out.println("After removing duplicates:");
        for(int i=0; i<array_unique.length; i++){
            System.out.println(array_unique[i]);}
        findIndex(array_unique,8);}
    public static void findIndex(int[] a, int element){
        ArrayList<Integer> al= new ArrayList<>();
        for(int i=0 ;i<a.length; i++){
            al.add(a[i]);}
        System.out.println("Index of element:"+ element+ " is " + al.indexOf(element));}}


public class PRemoveDuplicatesFromString16 {
        public static void main(String args[]){
            char[] str="dahdgahf".toCharArray();
            int n= str.length;
            System.out.println(removeDuplicates(str,n));}
        public static String removeDuplicates(char[] str, int n){
            int index =0;
            for(int i=0; i<n; i++){
                int j;
                for(j=0; j<i; j++){
                    if(str[i]==str[j]){
                        break;}}
                if(j==i)
                    str[index++]=str[i];}
            return String.valueOf(Arrays.copyOf(str,index));}}


public class RSearchElementInUnsortedArray17 {
    public static void main(String args[]){
        int[] numArr= {89,19,80,78,16};
        int key=92;
        int position=findElement(numArr,key);
        System.out.println(findElement(numArr,key));
        if(position==-1){
            System.out.println("Element not found");
        } else { System.out.println("Element found:" + position);}}
    public static int findElement(int[] numArr,int key) {
        for(int i=0; i<numArr.length; i++){
            if(numArr[i]==key){
                return i;}
        return -1;}}

public class SSearchElementInSortedArrayBinarySearch18 {
    public static void main(String args[]){
        int[] arr={5,8,9,6,7,8};
        int n=arr.length-1;
        int key=9;
        System.out.println("Index:"+ binarySearch(arr,0,n,key));}
    public static int binarySearch(int[] arr, int low, int high, int key){
        if(high < low){
            return -1;}
        int mid=(low+high)/2;
        if(key== arr[mid])
            return mid;
        if(key> arr[mid+1])
            return binarySearch(arr,(mid+1), high,key);
        return  binarySearch(arr,low, (mid+1),key);}}

    public class TFindThirdLargestElement19 {
  public static void main(String args[]){
      int[] numArr={12,89,45,67,78};
      System.out.println(getThridLargestElement(numArr));}
  public static int getThridLargestElement(int[] numArr){
      Arrays.sort(numArr);
      return numArr[numArr.length-3];}}
    
    public class UFindSecndSmallestNumberInArray20 {
    public static void main(String args[]){
        int[] numArr={12,89,45,67,78};
        System.out.println(secondSmallestElement(numArr));}
    public static int secondSmallestElement(int[] numArr){
        Arrays.sort(numArr);
        return numArr[1];}}

    
    class insertSortedMain {
    static int insertSorted(int arr[], int n, int key, int capacity)
    { if (n >= capacity)
            return n;
        int i;
        for (i = n - 1; (i >= 0 && arr[i] > key); i--)
            arr[i + 1] = arr[i];
        arr[i + 1] = key;
        return (n + 1);}
    public static void main(String[] args)
    { int arr[] = new int[20];
        arr[0] = 12;arr[1] = 16;arr[2] = 20;arr[3] = 40;arr[4] = 50;arr[5] = 70;
        int capacity = arr.length;int n = 6; int key = 26;
        n = insertSorted(arr, n, key, capacity);
        System.out.print("\nAfter Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");}}

    //sorteddelete
    class Main {
    static int binarySearch(int arr[], int low, int high, int key)
    {
        if (high < low)
            return -1;
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }static int deleteElement(int arr[], int n, int key)
    { int pos = binarySearch(arr, 0, n - 1, key);
        if (pos == -1) {
            System.out.println("Element not found");
            return n;}}
        int i;
        for (i = pos; i < n - 1; i++)
            arr[i] = arr[i + 1];
    return n - 1;   }  
    public static void main(String[] args)
    { int i;
        int arr[] = { 10, 20, 30, 40, 50 };
        int n = arr.length;
        int key = 30;
        n = deleteElement(arr, n, key);
        System.out.print("\n\nArray after deletion:\n");
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");}}
