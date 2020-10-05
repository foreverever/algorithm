package algorithm.baekjoon.bj1543;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String input = bf.readLine();
        String key = bf.readLine();

        System.out.println(findAns(input, key));
    }

    private static int findAns(String input, String key) {
        int cnt = 0;

        for (int i = 0; i <= input.length() - key.length(); ) {
            if (input.charAt(i) == key.charAt(0)) {
                if (input.substring(i, i + key.length()).equals(key)) {
                    cnt++;
                    i += key.length();
                    continue;
                }
            }
            i++;
        }
        return cnt;
    }
}