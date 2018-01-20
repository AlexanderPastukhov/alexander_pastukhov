package ru.job4j.array;
/**
 * @author Alexander Pastukhov (aib78@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Turn {
    /***
     * переворачивает входящий массив и возвращает ссылку на перевернутый массив
     * @param array ссылка на входящий массив
     * @return возвращает ссылку на перевернутый массив
     */
    int[] back(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int buffer = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = buffer;
        }
        return array;
    }
}
