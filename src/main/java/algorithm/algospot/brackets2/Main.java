package algorithm.algospot.brackets2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String gul = "";

        Map<Character, Character> m = new HashMap<>();
        m.put('(', ')');
        m.put('{', '}');
        m.put('[', ']');

        for (int i = 0; i < n; i++) {
            gul = br.readLine();
            System.out.println(findAns(n, gul, m));
        }
    }

    private static String findAns(int n, String gul, Map<Character, Character> m) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < gul.length(); i++) {
            char c = gul.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
                continue;
            }
            if (st.empty()) return "NO";
            if (m.get(st.peek()) == c) st.pop();
        }
        if (st.empty()) return "YES";
        return "NO";
    }
}
