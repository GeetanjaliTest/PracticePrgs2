package stringPractice;/*A thread in Java is the direction or path that is taken while a program is being executed.
Generally, all the programs have at least one thread, known as the main thread,
that is provided by the JVM or Java Virtual Machine at the starting of the program's execution.
 */
/*In Java, Multithreading refers to a process of executing two or more threads
simultaneously for maximum utilization of the CPU
 */
/*A string buffer is like a String , but can be modified.
At any point in time it contains some particular sequence of characters,
 but the length and content of the sequence can be changed through certain method calls.
 String buffers are safe for use by multiple threads.
 */

//p2-Java program to reverse a String using StringBuffer
//o [] {

public class BBRevStringUsingStringBuffer2 {
    public static void main(String args[]){
        String str= "My name is Chinmai";
        StringBuffer sb = new StringBuffer(str);
        System.out.println("Reverse string:"+ sb.reverse());
    }
}
