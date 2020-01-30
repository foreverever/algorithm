package algorithm.baekjoon.bj5704;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    private static Map<Character, Boolean> alphabet = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        while (!input.equals("*")) {
            initMap();

            if (isPangram(input)) {
                System.out.println("Y");
            } else System.out.println("N");
            input = br.readLine();
        }
    }

    private static boolean isPangram(String input) {
        for (char c : input.toCharArray()) {
            if (c == ' ') continue;
            alphabet.put(c, true);
        }
        return countAlphabet() == 26;
    }

    private static int countAlphabet() {
        int cnt = 0;
        for (Character key : alphabet.keySet()) {
            if (alphabet.get(key)) cnt++;
        }
        return cnt;
    }

    private static void initMap() {
        for (char i = 'a'; i <= 'z'; i++) {
            alphabet.put(i, false);
        }
    }
}
