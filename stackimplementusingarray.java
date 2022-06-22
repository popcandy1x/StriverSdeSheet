public class Stack {
    int[] a;
    int top=-1;
    public Stack(int b){
        a=new int[b];
    }
    void push(int num) {
        if(isFull()==1){
            return;
        }
        top++;
        a[top]=num;
    }
    int pop() {
        if(isEmpty()==1){
            return -1;
        }
        int t=a[top];
        top--;
        return t;
    }
    int top() {
        if(isEmpty()==1){
            return -1;
        }
        return a[top];
    }
    int isEmpty() {
       return top==-1?1:0;
    }
    int isFull() {
        return top==a.length-1?1:0;
    }
}
