package algorithm.baekjoon.bj7785;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    private static final String LEAVE = "leave";

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());

        Map<String, String> inOutLog = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = bf.readLine().split(" ");
            String name = input[0];
            String inOut = input[1];

            if (inOut.equals(LEAVE)) {
                inOutLog.remove(name);
                continue;
            }
            inOutLog.put(name, inOut);
        }

        List<String> answer = new ArrayList<>(inOutLog.keySet());
        answer.sort(Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String name : answer) {
            sb.append(name).append(System.lineSeparator());
        }
        System.out.println(sb.toString());
    }
}
