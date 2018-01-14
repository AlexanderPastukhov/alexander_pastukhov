package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Alexander Pastukhov (aib78@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class ArrayDuplicate {
    /**
     * удаляет дубликаты из элементов массива
     * @param array массив строк
     * @return возвращает уменьшенный массив на размер дублированных строк
     */
    public String[] remove(String[] array) {
        int doubleValues = 0;
        for (int i = 0; i < array.length - doubleValues; i++) {
            for (int j = i + 1; j < array.length - doubleValues; j++) {
                if (array[i].equals(array[j])) {
                    String buffer = array[j];
                    array[j] = array[array.length - 1 - doubleValues];
                    array[array.length - 1 - doubleValues] = buffer;
                    j--;
                    doubleValues++;
                }
            }
        }
        return Arrays.copyOf(array, array.length - doubleValues);
    }
}
