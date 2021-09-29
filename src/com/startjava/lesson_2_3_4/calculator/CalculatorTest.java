package com.startjava.lesson_2_3_4.calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Creator Dmitrii Titov
 * Date 29.09.2021 Version 1.0.1
 */
public class CalculatorTest {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Calculator calculator = new Calculator();
        String yesOrNo = " ";

        while (!"no".equals(yesOrNo)) {
            System.out.println("\n" + "Рад тебя видеть, друг! Начнем вычисления!" + "\n");
            System.out.println("""
                    Знаки для вычисления представлены ниже:
                     "+" - для сложения,
                     "-" - для вычитания,
                     "*" - для умножения,
                     "/" - для деления,
                     "^" - для возведения числа в степень (после знака введите нужную вам степень числа),
                     "%" - для того чтобы узнать остаток от деления.\s""" + "\n");
            System.out.print("Введите математическое выражение: ");

            calculator.calculate();

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                yesOrNo = reader.readLine();
            } while (!"no".equals(yesOrNo) && !"yes".equals(yesOrNo));
        }
    }
}

