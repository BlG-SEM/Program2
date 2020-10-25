package ru.vsu.cs;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите числа А, В, С");
        // читаем 3 переменные в любом порядке
        double a = readNumber();
        double b = readNumber();
        double c = readNumber();
        // упорядочиваем числа по возрастанию
        if (a > b) {
            a = a + b; b = a - b; a = a - b;
        }
        if (b > c) {
            b = b + c; c = b - c; b = b - c;
        }
        if (a > b) {
            a = a + b; b = a - b; a = a - b;
        }

        processProgression(a,b,c);
    }

    private static double readNumber() {
        Scanner Scanner = new Scanner(System.in);
        return Scanner.nextDouble();
    }

    private static void processProgression(double a, double b, double c) {
        Locale.setDefault(Locale.ROOT);
        if (b + (b - a) == c) {
            System.out.printf("Это арифметическая прогрессия, d = %1$.1f", b - a);
        } else if (b * (b / a) == c) {
            System.out.printf("Это геометрическая прогрессия, q = %1$.1f", b / a);
        } else
            System.out.println("Последовательность не является прогрессией");
    }
}
