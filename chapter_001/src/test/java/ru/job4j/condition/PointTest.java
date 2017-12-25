package ru.job4j.condition;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test.
 *
 * @author Alexander Pastukhov (aib78@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class PointTest {
    @Test
    public void whenDistanceToThreeTwoAndOneTwo() {
        Point first = new Point(3, 2);
        Point second = new Point(1, 2);
        double result = first.distanceTo(second);
        double expected = 2D;
        assertThat(result, is(expected));
    }
}
