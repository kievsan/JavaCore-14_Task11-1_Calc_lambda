// Task111
// Домашнее задание к занятию 1.1.
// Лямбда-выражения
// Задача 1. Калькулятор

package knhel7.jd14.javacore14.task111;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1,1);

        System.out.print("int(" + a + "/" + b + ") = ");
        try {
            double c = calc.devide.apply(a, b);
//            double c = calc.devide.applyAsDouble(a, b);
            calc.println.accept((int) c);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль!");
        }

        int abs = -10;
        int d = calc.abs.apply(abs);
        System.out.print("abs(" + abs + ") = ");
        calc.println.accept(d);
    }


}
