package algorithm.codility.countingelement;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] arr = new int[N];
        int mx = 0, totalMx = 0;

        for (int val : A) {
            if (val == N + 1) {
                totalMx += mx;
                mx = 0;
                arr = new int[N];
                continue;
            }
            arr[val - 1]++;
            mx = arr[val - 1] > mx ? arr[val - 1] : mx;
        }
        for (int i = 0; i < N; i++) {
            arr[i] += totalMx;
        }
        return arr;
    }
}
