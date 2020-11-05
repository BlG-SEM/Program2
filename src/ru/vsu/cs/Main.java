package ru.vsu.cs;

import java.util.Scanner;
import java.util.Locale;

public class Main {
     public static void main(String[] args) {
        double[] arrNumbers = new double[3];
        readNumber(arrNumbers);
        Arrays.sort(arrNumbers);
 
        if (isArithmeticProgression(arrNumbers)) {
            printPhrase("a arithmetic progression, d =",
                    getCoefficientOfArithmeticProgression(arrNumbers[1], arrNumbers[0]));
        } else if (isGeometricProgression(arrNumbers)) {
            printPhrase("a geometric progression, q =",
                    getCoefficientOfGeometricProgression(arrNumbers[1], arrNumbers[0]));
        } else
            System.out.println("The sequence is not a progression");
    }
 
    private static void readNumber(double[] arrNumbers) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter number");
        for(int i = 0; i < 3; i++) {
             arrNumbers[i] = Scaner.nextDouble();
        }
    }
 
    private static boolean isArithmeticProgression(double[] arrNumbers) {
        double coefficient = getCoefficientOfArithmeticProgression(arrNumbers[1], arrNumbers[0]);
        return arrNumbers[1] + coefficient == arrNumbers[2];
    }
 
    private static boolean isGeometricProgression(double[] arrNumbers) {
        double coefficient = getCoefficientOfGeometricProgression(arrNumbers[1], arrNumbers[0]);
        return arrNumbers[1] * coefficient == arrNumbers[2];
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
