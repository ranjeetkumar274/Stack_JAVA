public class ImplementationUsingLinkedList {

    //create a node class with constructor
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next = null;
        }
    }

    //create a stck class

    static class Stack{
        public static Node head;
        //check karenge ki list  empty to nahi hai kahi
        public static boolean isEmpty(){
            return head == null;
        }
        public static void push(int data){
            Node temp = new Node(data);
            if(isEmpty()){
                head = temp;
                return;
            }
            //agar empty nahi hai to
            temp.next = head;
            head = temp;
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while( !s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
