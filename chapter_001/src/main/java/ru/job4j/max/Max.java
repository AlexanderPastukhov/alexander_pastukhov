package ru.job4j.max;
/**
 * @author Alexander Pastukhov (aib78@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Max {
    /**
     * возвращает максимум из двух чисел
     * @param first первое число.
     * @param second второе число.
     * @return макимальное из двух чисел
     */
    public int max(int first, int second) {
        return (first > second) ? first : second;
    }
}
