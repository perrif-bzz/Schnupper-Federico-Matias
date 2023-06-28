package dev.zwazel.hard;

/**
 * Write a program that calculates and prints out the factorial of a given number using recursion.
 * <p>
 * Example: Factorial of 5 is "5 * 4 * 3 * 2 * 1" = 120
 */
public class Factorial
{
    public static int factorial(int number)
    {
        for (int i = number; number > 0; i--)
        {
            number *= i;
            return factorial(number - 1);
        }

        return 0; // TODO implement here
    }
}
