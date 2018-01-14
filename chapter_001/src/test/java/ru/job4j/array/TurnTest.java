package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class TurnTest {
    @Test
    public void whenArrayHasFiveElements() {
        int[] turnedArray = new int[] {1, 2, 3, 4, 5};
        Turn turn = new Turn();
        int[] result = turn.back(turnedArray);
        int[] rightResult = new int[] {5, 4, 3, 2, 1};
        assertThat(result, is(rightResult));
    }
    @Test
    public void whenArrayHasFourElements() {
        int[] turnedArray = new int[] {4, 1, 6, 2};
        Turn turn = new Turn();
        int[] result = turn.back(turnedArray);
        int[] rightResult = new int[] {2, 6, 1, 4};
        assertThat(result, is(rightResult));
    }
}

