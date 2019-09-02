package algorithm.baekjoon.bj6603;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int MAX = 6;
    private static final List<String> choose = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        findAns(br);
    }

    private static void findAns(BufferedReader br) throws IOException {
        while (true) {
            String[] lotto = br.readLine().split(" ");
            if (lotto[0].equals("0")) break;
            dfs(0, 1, lotto);
            System.out.println();
        }
    }

    private static void dfs(int cnt, int cur, String[] lotto) {
        if (cnt == MAX) {
            for (String s : choose) {
                System.out.print(s + " ");
            }
            System.out.println();
            return;
        }
        for (int i = cur; i < lotto.length; i++) {
            choose.add(lotto[i]);
            dfs(cnt + 1, i + 1, lotto);
            choose.remove(choose.size() - 1);
        }
    }
}
