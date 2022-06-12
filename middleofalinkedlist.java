import java.util.* ;
import java.io.*; 
/****************************************************************

    Following is the class structure of the Node class:

       class Node 
        { 
        public:
            int data;
            Node next;
            Node(int data) 
            {
              this.data = data;
              this.next = null;
            }
        };

*****************************************************************/

public class middleofalinkedlist{
    public static Node findMiddle(Node head) 
    {
        Node d=head;
        int count=0;
        while(d!=null){
            d=d.next;
            count++;
        }
        if(count%2==0){
            int k=(count/2)+1;
            k=k-1;
            while(k-->0){
                head=head.next;
            }
            return head;
        }
        else{
            int k=(count/2)+1;
            k=k-1;
            while(k-->0){
                head=head.next;
            }
            return head;
        } 
    }
}
