package phase1;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class StackArrayBased implements StackInterface {
    int MAX_STACK = 50; // maximum size of stack
    private Object items[];
    private int top;  //index top
    
    public StackArrayBased() {
        items= new Object[MAX_STACK];
        top=-1;
    } //end default constructor

    public boolean isEmpty() {
        return top < 0;
    } // end isEmpty
    
     public boolean isFull() {
        return top == MAX_STACK-1;
    }  // end isFull

    public void push(Object newItem) throws StackException {
        if (!isFull()) {
            items[++top] = newItem;
        }     
        else {
            items=resize(items);
            items[++top]= newItem;
        } // end if
    } // end push
    
    public void popAll() {
        items = new Object[MAX_STACK]; 
        top = -1; 
    } // end popAll
    
    public Object pop() throws StackException {
        if (!isEmpty()) {
            return items[top--];
        }
        else {
            throw new StackException("StackException on pop: stack empty");
        } // end if
    } // end pop
    
    public Object peek() throws StackException {
        if (!isEmpty()) {
            return items[top];
    }
        else {
            throw new StackException("Stack exception on peek - stack empty");
        } // end if
    } // end peek

    public Object[] resize(Object[] items)
    {
        // allocate memory for new stack
        Object[] new_a = new Object[MAX_STACK*2];
    
        // copying the content of old stack
        for (int i = 0; i < MAX_STACK; i++)
            new_a[i] = items[i];
    
        // re-sizing the length
        MAX_STACK=MAX_STACK*2;
        return new_a;
    }
} // end StackArrayBased