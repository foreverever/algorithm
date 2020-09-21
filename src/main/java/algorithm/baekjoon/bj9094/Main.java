package algorithm.baekjoon.bj9094;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    private static int ans;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());


        for (int i = 0; i < tc; i++) {
            String[] inputArr = br.readLine().split(" ");
            int[] input = Arrays.stream(inputArr).mapToInt(Integer::parseInt).toArray();

            int n = input[0];
            int m = input[1];

            ans = 0;
            System.out.println(getAns(n, m));
        }
    }


    private static void dfs(int idx, int n, int m, List<Integer> numbers) {
        if (numbers.size() == 2) {
            int a = numbers.get(0);
            int b = numbers.get(1);

            if (((a * a) + (b * b) + m) % (a * b) == 0) ans++;
            return;
        }

        for (int i = idx; i < n; i++) {
            numbers.add(i);
            dfs(i + 1, n, m, numbers);
            numbers.remove(numbers.size() - 1);
        }
    }

    private static int getAns(int n, int m) {
        List<Integer> numbers = new ArrayList<>();
        dfs(1, n, m, numbers);
        return ans;
    }
}
