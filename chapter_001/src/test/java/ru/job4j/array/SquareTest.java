package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class SquareTest {
    @Test
    public void whenSquareCalculateTwo() {
        int[] check = new int[2];
        check[0] = 1;
        check[1] = 4;
        Square square = new Square();
        int[] rezult = square.calculate(2);
        assertThat(rezult, is(check));
    }
}
