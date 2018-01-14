package ru.job4j.array;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class ArrayDuplicateTest {
    @Test
    public  void whenDublicateArrayHasFiveWords() {
        String[] array = new String[] {"Привет", "Мир", "Мир", "Привет", "Супер", "Мир"};
        String[] rightResult = new String[] {"Привет", "Мир", "Супер"};
        ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
        String[] result = arrayDuplicate.remove(array);
        assertThat(result, is(rightResult));
    }
}
