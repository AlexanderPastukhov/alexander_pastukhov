package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class FindLoopTest {
    @Test
    public void whenFindLoopSecondElement() {
        int[] data = new int[] {1, 5, 78, 23, 545, 65};
        int el = 5;
        FindLoop findLoop = new FindLoop();
        int result = findLoop.indexOf(data, el);
        assertThat(result, is(1));
    }
    @Test
    public void whenFindLoopNotFound() {
        int[] data = new int[] {1, 5, 78, 23, 545, 65};
        int el = 55;
        FindLoop findLoop = new FindLoop();
        int result = findLoop.indexOf(data, el);
        assertThat(result, is(-1));
    }
}
