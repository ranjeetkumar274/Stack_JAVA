public class Stack {
     int size;
     int[] StackArray;
     int top;

    public Stack(int size){
        this.size = size;
        StackArray = new int[size];
        top = -1;
    }

    //method for if stack is empty
    public boolean isEmpty(){
        return top == -1;
    }

    //method for if stack is full
    public boolean isFull(){
        return top == size-1;
    }

    //method to push elements in the stack
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full, cant push elements.");
            return;
        }
        top++;
        StackArray[top] = value;
    }

    //method to pop element from the stack without removing it
    public int pop(){
        if(isEmpty()){
            System.out.println("stack is empty , cant pop element");
            return -1;
        }
        int poppedvalue = StackArray[top];
        top--;
        return poppedvalue;
    }

    //method to peek an element of the stack
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return StackArray[top];
    }

    //method to display elements of the stack
    public void display(){
        if(isEmpty()){
            System.out.println("stack is empty.");
            return;
        }
        for(int i = top; i >= 0; i--){
            System.out.print(StackArray[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.display();
        System.out.println("peek an element :"+ s.peek());
        System.out.println("popped an element :"+ s.pop());
        System.out.println("peek an element :"+ s.peek());
        s.display();

    }
}
