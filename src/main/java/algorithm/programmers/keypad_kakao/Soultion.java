package algorithm.programmers.keypad_kakao;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        List<Pos> keyPadNumber = new ArrayList<>();

        init(keyPadNumber);

        Pos leftPos = new Pos(3, 0);
        Pos rightPos = new Pos(3, 2);

        for (int number : numbers) {
            Pos nextPos = keyPadNumber.get(number);

            //중간인 경우
            if (nextPos.getX() == 1) {
                int rightDistance = rightPos.calcDist(nextPos);
                int leftDistance = leftPos.calcDist(nextPos);

                //같은 거리라면 손잡이순
                if (rightDistance == leftDistance) {
                    if (hand.equals("right")) {
                        rightPos = nextPos;
                        answer += "R";
                    } else {
                        leftPos = nextPos;
                        answer += "L";
                    }
                    continue;
                }

                //다른 거리면 가까운 쪽
                if (rightDistance > leftDistance) {
                    leftPos = nextPos;
                    answer += "L";
                } else {
                    rightPos = nextPos;
                    answer += "R";
                }
                continue;
            }

            //왼쪽인 경우
            if (nextPos.getX() == 0) {
                leftPos = nextPos;
                answer += "L";
                continue;
            }

            //오른쪽인 경우
            if (nextPos.getX() == 2) {
                rightPos = nextPos;
                answer += "R";
            }
        }
        return answer;
    }

    private void init(List<Pos> keyPadNumber) {
        keyPadNumber.add(new Pos(3, 1));

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                keyPadNumber.add(new Pos(i, j));
            }
        }
    }
}

class Pos {
    private int y;
    private int x;

    Pos(int y, int x) {
        this.y = y;
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public int calcDist(Pos nextPos) {
        return Math.abs(this.y - nextPos.y) + Math.abs(this.x - nextPos.x);
    }
}