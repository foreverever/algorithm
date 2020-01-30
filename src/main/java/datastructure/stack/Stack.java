package datastructure.stack;

public class Stack {
    private Object[] stack = new Object[1000];
    int top = -1;

    public Object peek() {
        if (isEmpty()) throw new RuntimeException();
        return stack[top];
    }

    public void push(Object value) {
        stack[++top] = value;
    }

    public Object pop() {
        if (isEmpty()) throw new RuntimeException();
        return stack[top--];
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public int size() {
        return top + 1;
    }
}
