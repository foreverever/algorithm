package algorithm.programmers.printer;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    Queue<Page> pages = new LinkedList<>();

    public int solution(int[] priorities, int location) {
        Page myPage = new Page(priorities[location], location);

        for (int i = 0; i < priorities.length; i++) {
            pages.offer(new Page(priorities[i], i));
        }

        Arrays.sort(priorities);

        int cnt = 0;
        while (!pages.isEmpty()) {
            int mx = priorities[pages.size() - 1];
            Page front = pages.poll();

            if (front.value == mx) {
                cnt++;
                if (front.value == myPage.value && front.location == myPage.location) {
                    break;
                }
                continue;
            }
            pages.offer(front);
        }
        return cnt;
    }

    class Page {
        int value;
        int location;

        Page(int value, int location) {
            this.value = value;
            this.location = location;
        }
    }
}
