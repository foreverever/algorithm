package datastructure.stack;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(3);
        st.push(2);
        st.push(1);
        System.out.println("size : " + st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());

        Queue<Integer> q = new LinkedList<>();
        java.util.Stack<Integer> s = new java.util.Stack<>();
        List<Object> ll = new LinkedList<>();
        Map<String, Integer> m = new HashMap<>();
        Collection<Integer> entries = m.values();
        
    }
}
