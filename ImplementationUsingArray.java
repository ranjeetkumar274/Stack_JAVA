public class Stack {
    int size = 10000;
    int[] nums = new int[size];
    int top = -1;


    void push(int x) {
        if (top == size - 1) {
            System.out.println("Stack overflow");
        } else {
            top++;
            nums[top] = x;
        }
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return nums[top];
        }
    }


    int pop() {
        if (top == -1) {
            System.out.println("Stack underflow");
            return -1;
        } else {
            int x = nums[top];
            top--;
            return x;
        }
    }


    int size() {
        return top + 1;
    }
}

public class ImplementationUsingArray {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(6);
        st.push(7);

        System.out.println("Top element of the stack: " + st.peek());
        System.out.println("Deleted element from the stack: " + st.pop());
        System.out.println("Top element of the stack after pop: " + st.peek());
    }
}
