package algorithm.baekjoon.bj7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] sArr = br.readLine().split(" ");
            int[] iArr = Arrays.stream(sArr).mapToInt(Integer::parseInt).toArray();
            people.add(new Person(iArr[0], iArr[1]));
        }

        for (int i = 0; i < people.size(); i++) {
            for (int j = 0; j < people.size(); j++) {
                if (i == j) continue;

                Person selectedPerson = people.get(i);
                if (selectedPerson.isBig(people.get(j))) {
                    selectedPerson.plusRank();
                }
            }
        }

        for (Person person : people) {
            System.out.print(person.getRank() + " ");
        }
    }

    static class Person {
        private int weight;
        private int height;
        private int rank = 1;

        Person(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        boolean isBig(Person person) {
            return (this.weight < person.weight) && (this.height < person.height);
        }

        void plusRank() {
            this.rank++;
        }

        int getRank() {
            return this.rank;
        }
    }
}
