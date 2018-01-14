package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class MatrixTest {
    @Test
    public  void whenMultiplyMatrixHasSizeThree() {
        int[][] rightResult = new int[][] {{0, 0, 0}, {0, 1, 2}, {0, 2, 4}};
        Matrix matrix = new Matrix();
        int[][] result = matrix.multiple(3);
        assertThat(result, is(rightResult));
    }
}
