package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class CounterTest {
    @Test
    public void whenCounterOneToTen() {
        Counter counter = new Counter();
        int start = 1;
        int finish = 10;
        int result = counter.add(start, finish);
        assertThat(result, is(30));
    }
}
