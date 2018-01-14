package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class BubbleSortTest {
    @Test
    public void whenBubbleSortRun() {
        int[] array = new int[] {5, 1, 2, 7, 3};
        BubbleSort bubbleSort = new BubbleSort();
        int[] result = bubbleSort.sort(array);
        int[] rightResult = new int[] {1, 2, 3, 5, 7};
        assertThat(result, is(rightResult));
    }
}
