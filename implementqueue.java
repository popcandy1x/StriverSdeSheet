class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

 }

public class Queue {
    
    private Node head;
    private Node rear;
    private int size;


    public Queue() {
    }
    
    public boolean isEmpty() { 
        return size==0;
    }


    public void enqueue(int data) {
        Node a=new Node(data);
        if(isEmpty())
            rear=head=a;
        else
        {
            rear.next=a;
            rear=a;
        }
        size++;
    }


    public int dequeue() {
        if(isEmpty()){
            return -1;
        }
        int data=head.data;
        head=head.next;
        size--;
        return data;
    }


    public int front() {
        if(isEmpty()){
            return -1;
        }
        return head.data;
    }
}
