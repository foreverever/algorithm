package algorithm.baekjoon.bj1269;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        bf.readLine();

        String[] a = bf.readLine().split(" ");
        String[] b = bf.readLine().split(" ");

        System.out.println(calcDiff(a, b) + calcDiff(b, a));
    }

    private static int calcDiff(String[] first, String[] sencond) {
        Map<String, Boolean> map = new HashMap<>();

        for (String s : first) {
            map.put(s, true);
        }

        int diffCount = sencond.length;
        for (String s : sencond) {
            if (map.containsKey(s)) diffCount--;
        }
        return diffCount;
    }
}
