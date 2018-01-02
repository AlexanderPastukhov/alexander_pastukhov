package ru.job4j.loop;
/**
 * @author Alexander Pastukhov (aib78@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Counter {
/**
 * вычисляет сумму четных чисел
 * @param start - начало диапазона
 * @param finish - окончание диапазона
 * @return возвращает сумму четных чисел
 */
    public int add(int start, int finish) {
        int summ = 0;

        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                summ = summ + i;
            }
        }
        return summ;
    }
}
