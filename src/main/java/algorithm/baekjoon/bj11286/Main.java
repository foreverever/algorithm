package algorithm.baekjoon.bj11286;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bf.readLine());
        PriorityQueue<Number> pq = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(bf.readLine());

            if (input == 0) {
                if (pq.isEmpty()) System.out.println(0);
                else System.out.println(pq.poll().origin);
                continue;
            }
            pq.offer(new Number(input, Math.abs(input)));
        }
    }
}

class Number implements Comparable<Number> {
    int origin;
    int abs;

    Number(int origin, int abs) {
        this.origin = origin;
        this.abs = abs;
    }

    @Override
    public int compareTo(Number o) {
        if (this.abs < o.abs) return -1;
        else if (this.abs == o.abs) {
            return this.origin <= o.origin ? -1 : 1;
        } else return 1;
    }
}
