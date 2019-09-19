package algorithm.baekjoon.bj6603;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.Arrays;

public class MainTest {

    @Test
    public void arrToString() {
        String[] arr = {"1", "2"};
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void splitOnlyOne() {
        String str = "0";
        assertThat(str.split(" ")[0]).isEqualTo("0");
    }

    @Test
    public void blankTest() {
        String blank = "";
        assertThat(blank).isEqualTo("");
        assertThat(blank).isBlank();
    }
}