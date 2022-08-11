package ArrayPrg;

public class RSearchElementInUnsortedArray17 {
    public static void main(String args[]){
        int[] numArr= {89,19,80,78,16};
        int key=92;
        int position=findElement(numArr,key);
        System.out.println(findElement(numArr,key));
        if(position==-1){
            System.out.println("Element not found");
        } else {
            System.out.println("Element found:" + position);
        }
    }
    public static int findElement(int[] numArr,int key) {
        for(int i=0; i<numArr.length; i++){
            if(numArr[i]==key){
                return i;
            }
        }
        return -1;

    }
}
