package datastructure.queue;

import java.util.ArrayList;
import java.util.List;

public class Queue {
    private List<String> queue;
    private int front = 0;
    private int size = 0;

    public Queue() {
        queue = new ArrayList<>();
    }

    public void push(String data) {
        queue.add(data);
        size++;
    }

    public int size() {
        return size;
    }

    public void pop() {
        if (size == 0) throw new NullPointerException();
        front++;
        size--;
    }

    public String front() {
        if (size == 0) throw new NullPointerException();
        return queue.get(front);
    }

    public boolean empty() {
        return size == 0;
    }
}
