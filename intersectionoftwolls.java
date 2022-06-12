import java.util.* ;
import java.io.*; 
/************************************
     
     //Following is the class structure of the LinkedListNode class:
     
      class LinkedListNode<T> {
        public T data;
        public LinkedListNode<T> next;
        
        public LinkedListNode(T data) {
            this.data = data;
            this.next = null;
        }
    }

*****************************************/
public class Solution {

    public static int findIntersection(LinkedListNode<Integer> firstHead, LinkedListNode<Integer> secondHead) {
        Set<LinkedListNode<Integer>> s=new HashSet<>();
        if(firstHead.data==secondHead.data){
            return firstHead.data;
        }
        while(firstHead.next!=null){
            s.add(firstHead);
            firstHead=firstHead.next;
        }
        while(secondHead!=null){
            if(!s.add(secondHead)){
                return secondHead.data;
            }
            secondHead=secondHead.next;
        }
        return -1;
    }
}