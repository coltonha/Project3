 /*
 * Project #3
 * Source Code File: Node.java
 * Programmer: Sungwoong Ha
 * Due: 4/13/21
 * Description: This is a Java implementation of a node
 * 
 */
package phase2;

public class Node {
    public char item;
    public Node next;
    public Node(){
        item='\0';
        next=null;
    }
    public Node(char newItem){
        setItem(newItem);
    }
    public Node (char newItem, Node newNext){
        setItem(newItem);
        setNext(newNext);
    }

    public int getItem() {
        return item;
    }
    public Node getNext() {
        return next;
    }
    public void setItem(char newItem){
        item=newItem;
    }
    public void setNext(Node newNext) {
        next=newNext;
    }
    
}