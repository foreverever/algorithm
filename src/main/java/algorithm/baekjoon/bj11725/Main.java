package algorithm.baekjoon.bj11725;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        Graph graph = new Graph(N);

        int[] parent = new int[N + 1];
        boolean[] isChecked = new boolean[N + 1];
        Arrays.fill(isChecked, false);

        for (int i = 0; i < N - 1; i++) {
            String[] input = bf.readLine().split(" ");
            int first = Integer.parseInt(input[0]);
            int second = Integer.parseInt(input[1]);
            graph.add(first, second);
        }

        dfs(1, graph, isChecked, parent);

        for (int i = 2; i < parent.length; i++) {
            System.out.println(parent[i]);
        }
    }

    private static void dfs(int p, Graph graph, boolean[] isChecked, int[] parent) {
        isChecked[p] = true;
        for (int i = 0; i < graph.get(p).size(); i++) {
            int next = graph.get(p, i);
            if (!isChecked[next]) {
                parent[next] = p;
                dfs(next, graph, isChecked, parent);
            }
        }
    }
}

class Graph {
    private List<List<Integer>> graph = new ArrayList<>();

    Graph(int size) {
        for (int i = 0; i <= size; i++) {
            graph.add(new ArrayList<>());
        }
    }

    public void add(int first, int second) {
        graph.get(first).add(second);
        graph.get(second).add(first);
    }

    public List<Integer> get(int p) {
        return graph.get(p);
    }

    public int get(int p, int i) {
        return graph.get(p).get(i);
    }
}