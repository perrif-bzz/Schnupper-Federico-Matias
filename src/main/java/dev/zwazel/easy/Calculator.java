package dev.zwazel.easy;

/**
 * Warmup challenge: Write a calculator that can add, subtract, multiply, and divide two numbers.
 */
public class Calculator {
    public static float calculate(char operator, float number1, float number2) {
        float result = 0;
        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '*':
                result = number1 * number2;
                break;
        }
        return result; //default case for unknown operator
    }
}
