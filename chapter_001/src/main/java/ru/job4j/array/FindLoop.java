package ru.job4j.array;
/**
 * @author Alexander Pastukhov (aib78@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class FindLoop {
    /***
     * функция возвращает индекс массива с первым найденным элементом равным el
     * @param data массив для поиска
     * @param el значение для поиска
     * @return
     */
    public int indexOf(int[] data, int el) {

        int rsl = -1; // если элемента нет в массиве, то возвращаем -1.

        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rsl = index;
                break;
            }
        }

        return rsl;
    }
}
