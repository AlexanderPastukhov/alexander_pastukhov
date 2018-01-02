package ru.job4j.loop;
/**
 * @author Alexander Pastukhov (aib78@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Factorial {
    /**
     * вычисление факториала
     * @param n входящее число
     * @return возвращает факториал числа
     */
    public int calc(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
