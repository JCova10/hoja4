package uvg;

import java.util.Stack;

public class StackFactory {
    public Stack<Integer> createStack(String type){
        if(type.equals("Stack")){
            return new Stack<Integer>();
        }
        else{
            return null;
        }
    }
}
