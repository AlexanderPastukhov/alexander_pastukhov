package ru.job4j.array;
/**
 * @author Alexander Pastukhov (aib78@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class BubbleSort {
    public int[] sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int buffer = array [j];
                    array[j] = array[j + 1];
                    array[j + 1] = buffer;
                }
            }

        }
        return array;
    }
}
