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
        int halfOfLenght = array.length / 2;
        int lastIndex = array.length - 1;
        for (int i = 0; i < halfOfLenght; i++) {
            int buffer = array[i];
            array[i] = array[lastIndex - i];
            array[lastIndex - i] = buffer;
        }
        return array;
    }
}
