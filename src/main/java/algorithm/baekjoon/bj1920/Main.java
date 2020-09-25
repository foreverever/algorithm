package algorithm.baekjoon.bj1920;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        String[] inputArr = bf.readLine().split(" ");
        int[] a = Arrays.stream(inputArr).mapToInt(Integer::parseInt).sorted().toArray();

        int m = Integer.parseInt(bf.readLine());
        String[] mArr = bf.readLine().split(" ");

        for (String s : mArr) {
            if (binarySearch(a, Integer.parseInt(s)) >= 0) {
                System.out.println(1);
                continue;
            }
            System.out.println(0);
        }
    }
}
