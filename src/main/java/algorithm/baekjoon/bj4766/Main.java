package algorithm.baekjoon.bj4766;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Double> temperature = new ArrayList<>();

        String input = br.readLine();

        while (!input.equals("999")) {
            temperature.add(Double.parseDouble(input));
            input = br.readLine();
        }

        for (int i = 1; i < temperature.size(); i++) {
            double diff = temperature.get(i) - temperature.get(i - 1);
            System.out.println(String.format("%.2f", diff));
        }
    }
}
