package algorithm.baekjoon.bj1731;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        List<Long> numbers = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            numbers.add(Long.parseLong(br.readLine()));
        }

        System.out.println(findAns(N, numbers));
    }

    private static long findAns(int n, List<Long> numbers) {
        long first = numbers.get(n - 3);
        long second = numbers.get(n - 2);
        long third = numbers.get(n - 1);

        if (isArithmetic(first, second, third)) return 2 * third - second;
        return third * third / second;
    }

    private static boolean isArithmetic(long first, long second, long third) {
        return second - first == third - second;
    }
}