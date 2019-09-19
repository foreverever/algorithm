package algorithm.baekjoon.bj9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String gul = "";

        for (int i = 0; i < n; i++) {
            gul = br.readLine();
            System.out.println(findAns(gul, n));
        }
    }

    private static String findAns(String gul, int n) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < gul.length(); i++) {
            char c = gul.charAt(i);
            if (c == '(') {
                st.push(c);
                continue;
            }
            if(st.empty()) return "NO";
            st.pop();
        }
        if(st.empty()) return "YES";
        return "NO";
    }
}