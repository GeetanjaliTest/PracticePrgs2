package stringPractice;

//How to find length of string in java without using length() method
//p8
class HFindStringLen8 {

    public static void main(String args[]) {

        String helloWorld = "This is hello world";
        System.out.println("length of helloWorld string :" + getLengthOfStringWithCharArray(helloWorld));
    }

    public static int getLengthOfStringWithCharArray(String str) {
        int length = 0;
        char[] strCharArray = str.toCharArray();
        for (char c : strCharArray) {
            length++;
        }
        return length;
    }
}

