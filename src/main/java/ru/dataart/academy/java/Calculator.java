package ru.dataart.academy.java;

import java.util.ArrayList;
import java.util.List;

/**
 * Calculator - class for calculation.
 *
 * @author Vladimir Seregin (SereginSun@yandex.ru)
 * @since 1.0
 */
public class Calculator {

    /**
     * The method for calculating the sum of numbers obtained from lists in reverse order.
     * @param firstNumber  - list for first number in reversed order (1 - 2 - 3 -> 321)
     * @param secondNumber - list for second number in reversed order (1 - 2 - 3 -> 321)
     * @return - sum of firstNumber + secondNumber
     */
    public Integer getSum(List<Integer> firstNumber, List<Integer> secondNumber) {
        return getReversNum(firstNumber) + getReversNum(secondNumber);
    }

    /**
     * The method for getting a number from a list in reverse order.
     * @param list - list for number in reversed order (1 - 2 - 3 -> 321)
     * @return integer number.
     */
    private int getReversNum(List<Integer> list) {
        int result = 0;
        int order = 1;
        for (Integer value : list) {
            result += value * order;
            order *= 10;
        }
        return result;
    }

    /**
     * The method returns a list containing only the odd elements of the original list.
     * @param list - list of elements
     * @param <T> - type of element
     * @return - odd list elements
     * Example: [1, 22, 34] -> [1, 34]
     */
    public <T> List<T> getOddElements(List<T> list) {
        List<T> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i += 2) {
            result.add(list.get(i));
        }
        return result;
    }

    /**
     * The method returns a list containing only the first and last element of the original list.
     * @param list - list of elements
     * @param <T> - type of element
     * @return - first and last elements of the list
     * Example: [1, 2, 3] -> [1, 3]
     * [1, 2, 3 , 4] -> [1, 4]
     */
    public <T> List<T> getBounds(List<T> list) {
        List<T> result = new ArrayList<>();
        if (list.isEmpty() || list.size() == 1 || list.size() == 2) {
            return list;
        }
        result.add(list.get(0));
        result.add(list.get(list.size() - 1));
        return result;
    }
}
