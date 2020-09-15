package algorithm.baekjoon.bj14916;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(getAns(n));
    }

    private static int getAns(int n) {
        if (n < 5) return n % 2 == 0 ? n / 2 : -1;

        int remainder = n % 5;
        if (remainder % 2 == 0) return n / 5 + remainder / 2;
        else return n / 5 - 1 + (remainder + 5) / 2;
    }
}
