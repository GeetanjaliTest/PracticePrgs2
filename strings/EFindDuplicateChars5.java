package stringPractice;

import java.util.HashMap;
import java.util.Map;
//o [] {
//p5
//How to find duplicate characters in String in java?
//Hashmap
/*Java HashMap is a class which is used to perform operations such as inserting,
deleting and locating elements in a map. We create a map, where we pass two kinds of
 values which are 'key' and 'value'.
 HashMap allows one null key and duplicate null values
 */
/*HashMap is a non-synchronized class of the Java Collection Framework that contains null values and keys,
whereas Map is a Java interface, which is used to map key-pair values.
 */
public class EFindDuplicateChars5 {
    public static void main(String args[]){
        String str="geeksforgeeks";
        countDuplicateChars(str);
    }

    public static void countDuplicateChars(String str){
        Map<Character, Integer> map= new HashMap<Character, Integer>();

        char[] strArr = str.toCharArray();

        for (char c: strArr){
            if(map.containsKey(c))
            {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c,1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey() + ":"+ entry.getValue());
            }
        }
    }
}
