package algorithm.baekjoon.bj1620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] input = bf.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        Map<String, String> name = new HashMap<>();
        Map<String, String> number = new HashMap<>();

        int cnt = 0;
        while (cnt != N) {
            String poketmonName = bf.readLine();
            cnt++;
            String num = Integer.toString(cnt);
            name.put(poketmonName, num);
            number.put(num, poketmonName);
        }

        cnt = 0;
        while (cnt != M) {
            String problem = bf.readLine();
            cnt++;
            if (name.containsKey(problem)) System.out.println(name.get(problem));
            if (number.containsKey(problem)) System.out.println(number.get(problem));
        }
    }
}
