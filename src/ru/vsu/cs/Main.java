package ru.vsu.cs;

import java.util.Scanner;
import java.util.Locale;

public class Main {
     public static void main(String[] args) {
        double aNumber = readNumber("A = ");
        double bNumber = readNumber("B = ");
        double cNumber = readNumber("C = ");
 
        double[] arrOfSortedNumbers = sortNumbersInAscendingOrder(aNumber, bNumber, cNumber);
 
        if (isArithmeticProgression(arrOfSortedNumbers)) {
            printPhrase("a arithmetic progression, d =",
                    getCoefficientOfArithmeticProgression(arrOfSortedNumbers[1], arrOfSortedNumbers[0]));
        } else if (isGeometricProgression(arrOfSortedNumbers)) {
            printPhrase("a geometric progression, q =",
                    getCoefficientOfGeometricProgression(arrOfSortedNumbers[1], arrOfSortedNumbers[0]));
        } else
            System.out.println("The sequence is not a progression");
    }
 
    private static double readNumber(String name) {
        Scanner Scanner = new Scanner(System.in);
        System.out.printf("Enter %s", name);
        return Scanner.nextDouble();
    }
 
    private static double[] sortNumbersInAscendingOrder(double a, double b, double c) {
        a = Math.min(Math.min(a, b), c);
        b = Math.max(Math.min(a, b), Math.min(Math.max(a, b), c);
        c = Math.max(Math.max(a, b), c);

        return new double[]{a, b, c};
    }
 
    private static boolean isArithmeticProgression(double[] arrOfSortedNumbers) {
        double coefficient = getCoefficientOfArithmeticProgression(arrOfSortedNumbers[1], arrOfSortedNumbers[0]);
        return arrOfSortedNumbers[1] + coefficient == arrOfSortedNumbers[2];
    }
 
    private static boolean isGeometricProgression(double[] arrOfSortedNumbers) {
        double coefficient = getCoefficientOfGeometricProgression(arrOfSortedNumbers[1], arrOfSortedNumbers[0]);
        return arrOfSortedNumbers[1] * coefficient == arrOfSortedNumbers[2];
    }
 
    private static double getCoefficientOfArithmeticProgression(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
 
    private static double getCoefficientOfGeometricProgression(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
 
    private static void printPhrase(String phrase, double coefficient) {
        System.out.printf("It's %s ", phrase);
        System.out.println(coefficient);
    }
}
