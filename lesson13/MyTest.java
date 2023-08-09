import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class MyClassTest {

    @Test
    public void test1() {
        int[] input = {};
        int[] expected = {};
        int[] sorted = Sort.sort(input);
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void test2() {
        int[] input = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        int[] sorted = Sort.sort(input);
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void test3() {
        int[] input = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        int[] sorted = Sort.sort(input);
        assertArrayEquals(expected, sorted);
    }

    @Test
    public void test4() {
        int[] input = {5, 2, 1, 4, 3};
        int[] expected = {1, 2, 3, 4, 5};
        int[] sorted = Sort.sort(input);
        assertArrayEquals(expected, sorted);
    }
}
