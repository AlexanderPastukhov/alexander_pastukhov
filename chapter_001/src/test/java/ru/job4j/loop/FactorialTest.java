package ru.job4j.loop;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class FactorialTest {
    @Test
    public void whenFiveFactorial() {
        Factorial factorial = new Factorial();
        int n = 5;
        int rezult = factorial.calc(n);
        assertThat(rezult, is(120));
    }
}
