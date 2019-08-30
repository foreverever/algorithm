package algorithm.codility.countingelement;

public class FrogRiverOne {
    private boolean[] isDrop = new boolean[100001];

    public int solution(int X, int[] A) {
        int count = X;

        for (int i = 0; i < A.length; i++) {
            if (!isDrop[A[i]] && A[i] <= X) {
                isDrop[A[i]] = true;
                count--;
            }
            if (count == 0) return i;
        }
        return -1;
    }
}
