 /*
 * Project #3
 * Source Code File: StackReferenceBased.java
 * Programmer: Sungwoong Ha
 * Due: 4/13/21
 * Description: This is a Java implementation of a stackreference
 * 
 */
package phase2;
public class StackReferenceBased implements StackInterface {
    private Node top;

    public StackReferenceBased() {
        top = null; 
    } // end default constructor
    
    public boolean isEmpty() {
        return top == null;
    } // end isEmpty
    
    public void push(char newItem) {
        top = new Node(newItem, top);
    } // end push
    
    public char pop() throws StackException {
        if (!isEmpty()) {
            Node temp = top;
            top = top.next;
            return temp.item;
        }
        else {
            throw new StackException("StackException on " + "pop: stack empty");
        } // end if
    } // end pop
    
    public void popAll() {
        top = null;
    } // end popAll
    
    public char peek() throws StackException {
        if (!isEmpty()) {
            return top.item;
        }
        else {
            throw new StackException("StackException on " +"peek: stack empty");
        } // end if
    }// end peek
} // end StackReferenceBased