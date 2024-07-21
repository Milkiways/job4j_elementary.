package ru.job4j.ru.job4j.ru.job4j.ru.job4j.calculator.ru.job4j.calculator.ru.job4j.converter.ru.job4j.calculator.u.job4j.condition;

public class Point {

    public static double distance(int x1, int y1, int x2, int y2) {
        double first = x2 - x1;
        double second = y2 - y1;
        double three = Math.pow(first, 2);
        double four = Math.pow(second, 2);
        double five = three + four;
        double six = Math.sqrt(five);
        return six;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 3, 5, 2);
        System.out.println("result (0, 3) to (5, 2) " + result);
    }
}
