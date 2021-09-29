package com.startjava.lesson_2_3_4.calculator;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Calculator {
    private double firstNumber;
    private String sign;
    private double secondNumber;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String getSign() {
        return sign;
    }

    public boolean setSign(String sign) {
        if ("+".equals(sign) || "-".equals(sign) || "*".equals(sign) ||
                "/".equals(sign) || "^".equals(sign) || "%".equals(sign)) {
            this.sign = sign;
            return true;
        }
        return false;
    }

    //    public void split(String mathString) {
//        int pos = 0;
//        String[] mathSplit = mathString.split(" ");
//        for (String mathSplits : mathSplit) {
//            mathSplit[pos++] = mathSplits;
//        }
//        firstNumber = Integer.parseInt(mathSplit[0]);
//        sign = mathSplit[1];
//        secondNumber = Integer.parseInt(mathSplit[2]);
//    }
//
//    public double calculate() {
//        return switch (sign) {
//            case "+" -> firstNumber + secondNumber;
//            case "-" -> firstNumber - secondNumber;
//            case "*" -> firstNumber * secondNumber;
//            case "/" -> firstNumber / secondNumber;
//            case "^" -> Math.pow(firstNumber, secondNumber);
//            case "%" -> Math.IEEEremainder(firstNumber, secondNumber);
//            default -> 0.0;
//        };
//    }
    public double calculate() throws IOException {
        int pos = 0;
        String spliter = reader.readLine();
        String[] mathSplit = spliter.split(" ");
        for (String mathSplits : mathSplit) {
            mathSplit[pos++] = mathSplits;
        }
        firstNumber = Integer.parseInt(mathSplit[0]);
        sign = mathSplit[1];
        if ("+".equals(sign) || "-".equals(sign) || "*".equals(sign) ||
                "/".equals(sign) || "^".equals(sign) || "%".equals(sign)) {
            this.sign = sign;
        } else {
            sign = reader.readLine();
        }
        secondNumber = Integer.parseInt(mathSplit[2]);

        return switch (sign) {
            case "+" -> firstNumber + secondNumber;
            case "-" -> firstNumber - secondNumber;
            case "*" -> firstNumber * secondNumber;
            case "/" -> firstNumber / secondNumber;
            case "^" -> Math.pow(firstNumber, secondNumber);
            case "%" -> Math.IEEEremainder(firstNumber, secondNumber);
            default -> 0.0;
        };
    }
}
