package algorithm.programmers.pg68644;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        new Solution().solution(new int[1]);
    }

    public int[] solution(int[] numbers) {
        Set<Integer> result = new HashSet<>();
        boolean[] isUsed = new boolean[201];

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int sum = numbers[i] + numbers[j];
                if (isUsed[sum]) continue;
                result.add(sum);
                isUsed[sum] = true;
            }
        }
        return result.stream()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
