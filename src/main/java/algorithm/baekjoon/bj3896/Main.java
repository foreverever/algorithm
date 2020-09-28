package algorithm.baekjoon.bj3896;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static int MAX_SIZE = 1299710;

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        //소수 구하기
        boolean[] isPrime = getPrime();

        int tc = Integer.parseInt(bf.readLine());

        for (int i = 0; i < tc; i++) {
            int val = Integer.parseInt(bf.readLine());
            if (isPrime[val]) {
                System.out.println(0);
                continue;
            }
            System.out.println(getDistance(isPrime, val));
        }
    }

    private static int getDistance(boolean[] prime, int val) {
        return getMaxPrime(prime, val) - getMinPrime(prime, val);
    }

    private static int getMaxPrime(boolean[] prime, int val) {
        while (val <= MAX_SIZE) {
            if (prime[++val]) return val;
        }
        return 0;
    }

    private static int getMinPrime(boolean[] prime, int val) {
        while (val > 2) {
            if (prime[--val]) return val;
        }
        return 0;
    }

    private static boolean[] getPrime() {
        boolean[] prime = new boolean[MAX_SIZE];
        Arrays.fill(prime, true);

        for (int i = 2; i < MAX_SIZE; i++) {
            if (prime[i]) {
                checkNotPrimeNumber(i, prime);
            }
        }

        return prime;
    }

    private static void checkNotPrimeNumber(int i, boolean[] prime) {
        for (int n = i * 2; n < MAX_SIZE; n += i) {
            if (prime[n]) prime[n] = false;
        }
    }
}
