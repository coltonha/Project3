 /*
 * Project #3
 * Source Code File: StackTester.java
 * Programmer: Sungwoong Ha
 * Due: 4/13/21
 * Description: This is a Java implementation of a stacktester
 * 
 */
package phase1;

public class StackTester {
    public static void main(String[] args) {
        StackArrayBased stack = new StackArrayBased();
        for (int i=0; i<324; i++) {
            stack.push(i);
        } 
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        } 
} 
    