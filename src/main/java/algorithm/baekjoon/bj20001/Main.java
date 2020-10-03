package algorithm.baekjoon.bj20001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final String PROBLEM = "문제";
    private static final String SOLVE = "고무오리";

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(getAns(bf));
    }

    private static String getAns(BufferedReader bf) throws IOException {
        int problemCnt = 0;

        while (true) {
            String input = bf.readLine();
            if (input.contains("끝")) break;
            if (input.equals(PROBLEM)) problemCnt++;
            else if (input.equals(SOLVE)) {
                if (problemCnt == 0) {
                    problemCnt += 2;
                    continue;
                }
                problemCnt--;
            }
        }

        if (problemCnt == 0) return "고무오리야 사랑해";
        return "힝구";
    }
}
