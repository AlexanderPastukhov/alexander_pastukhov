package ru.job4j.array;
/**
 * @author Alexander Pastukhov (aib78@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Matrix {
    /***
     * Вовзращает таблицу умножения от 0 до size-1
     * @param size размереность матрицы
     * @return возвращает двумерный массив
     */
    int[][] multiple(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = i * j;
            }
        }
        return matrix;
    }
}
