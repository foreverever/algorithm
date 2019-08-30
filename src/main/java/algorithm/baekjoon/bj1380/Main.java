package algorithm.baekjoon.bj1380;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        findAns(sb);
        System.out.print(sb.toString());
    }

    private static void findAns(StringBuilder sb) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 1;

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            List<Student> students = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String name = br.readLine();
                students.add(new Student(name));
            }

            int num;
            for (int i = 0; i < 2 * n - 1; i++) {
                num = Integer.parseInt(br.readLine().split(" ")[0]);
                students.get(num - 1).count++;
            }
            sb.append(cnt++).append(" ").append(calc(students)).append(System.lineSeparator());
        }
    }

    private static String calc(List<Student> students) {
        for (Student student : students) {
            if (student.count != 2) return student.name;
        }
        return null;
    }

    static class Student {
        String name;
        int count = 0;

        public Student(String name) {
            this.name = name;
        }
    }
}
