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
    