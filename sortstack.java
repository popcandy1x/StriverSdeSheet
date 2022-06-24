import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;

public class Solution {
	public static void sortStack(Stack<Integer> stack) {
		ArrayList<Integer> a=new ArrayList<>(stack.size());
        while(!stack.isEmpty()){
            a.add(stack.pop());
        }
        Collections.sort(a);
        for(int i=0;i<a.size();i++){
            stack.add(a.get(i));
        }
	}
}