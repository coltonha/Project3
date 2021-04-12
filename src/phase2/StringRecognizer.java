package phase2;

public class StringRecognizer {
    public static void main(String[] args) {
        StackReferenceBased aStack = new StackReferenceBased();
        String testString ="abcd$dcba";
        int i=0;
        char ch=testString.charAt(i);
        //push till $
        while(ch!='$'){
            aStack.push(ch);
            ++i;
            ch=testString.charAt(i);
        }
        //skip $
        ++i;

        //matching seq
        boolean inLanguage=true;  //assume string is in language(abcd$dcba)

        while (inLanguage && i < testString.length()) {
            ch=testString.charAt(i); //the very first letter of w' in first recursion 
            try{
                char stackTop=aStack.pop();  //pop top from the stack(last letter in w in first recursion)
                if(stackTop==ch){
                    ++i; //move onto next letter
                }
                else{
                    inLanguage=false;
                }
            }
            catch(StackException e){
                inLanguage=false;
            }
        }
        
        if(inLanguage&&aStack.isEmpty()){
            System.out.println(testString + " is a language");
        }
        else{
            System.out.println(testString + " is not a langauage");
        }
    }
}