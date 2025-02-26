package uvg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListFactory{
    public List<Integer> createList(String type){
        if(type.equals("ArrayList")){
            return new ArrayList<Integer>();
        }
        else if(type.equals("LinkedList")){
            return new LinkedList<Integer>();
        }
        else if(type.equals("Vector")){
            return new Vector<Integer>();
        }
        else if(type.equals("Stack")){
            return new Stack<Integer>();
        }
        
        else{
            return null;
        }
    }
}