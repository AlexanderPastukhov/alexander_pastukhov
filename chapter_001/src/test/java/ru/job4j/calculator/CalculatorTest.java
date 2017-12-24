package ru.job4j.calculator;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenSubstractFiveMinusTwo() {
        Calculator calc = new Calculator();
        calc.substract(5D, 2D);
        double result = calc.getResult();
        double expected = 3D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenMultiplyFiveMultiplyTwo() {
        Calculator calc = new Calculator();
        calc.multiply(5D, 2D);
        double result = calc.getResult();
        double expected = 10D;
        assertThat(result, is(expected));
    }
    @Test
    public void whenDivideTenDivideTwo() {
        Calculator calc = new Calculator();
        calc.divide(10D, 2D);
        double result = calc.getResult();
        double expected = 5D;
        assertThat(result, is(expected));
    }
}