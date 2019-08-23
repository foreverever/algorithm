package codility.countingelement;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FrogRiverOneTest {

    @Test
    public void defaultBooleanArray() {
        boolean[] arr = new boolean[10];
        assertThat(arr[0]).isFalse();
    }

    @Test
    public void defaultIntArray() {
        int[] arr2 = new int[10];
        assertThat(arr2[0]).isEqualTo(0);
    }
}