import java.util.*;

public class Stack {

    Queue<Integer> a=new LinkedList<>();
    Queue<Integer> b=new LinkedList<>();


    public Stack() {
    }

    public int getSize() { 
       return a.size();
    }

    public boolean isEmpty() {
        return a.size()==0;
    }

    public void push(int element) {
        a.add(element);
    }

    public int pop() {
        if(isEmpty()){
            return -1;
        }
        int t=0;
        while(!(a.size()==1)){
            b.add(a.poll());
        }
        t=a.peek();
        a.poll();
        while(!b.isEmpty()){
            a.add(b.poll());
        }
        return t;
    }

    public int top() {
        if(isEmpty()){
            return -1;
        }
        int t=0;
        while(!a.isEmpty()){
            t=a.peek();
            b.add(a.poll());
        }
        while(!b.isEmpty()){
            a.add(b.poll());
        }   
        return t;
    }
}