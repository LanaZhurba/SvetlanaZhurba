package main.java;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        printThreeWords("Orange", "Banana", "Apple");

        checkSumSign();

        printColor();

        compareNumbers();

        System.out.println("Введите первое число");
        Scanner in = new Scanner(System.in);
        int firstNumber = in.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = in.nextInt();
        System.out.println(includeSumInInterval(firstNumber, secondNumber));

        checkNumberSign(75);

        System.out.println(isNegative(-1));

        printSentence("Hello World",3);

        System.out.println("Введите год");
        Scanner inyear = new Scanner(System.in);
        int year = inyear.nextInt();
        if (isLeapYear(year)) {
            System.out.println("год високосный");
        } else {
            System.out.println("год невисокосный");
        }

        createBinaryArray();

        createArray();

        multiplyArray();

        createArrayWithDiagonale();

        int [] arr = getArray(4,5);
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public static void printThreeWords(String word1, String word2, String word3) {
        System.out.println(word1 + "\n" + word2 + "\n" + word3);
    }

    public static void checkSumSign() {
        int a = -72;
        int b = 32;

        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 102;

        if (value <= 0) {
            System.out.println("Красный");
        } else {
            if (value > 100) {
                System.out.println("Зеленый");
            } else {
                System.out.println("Желтый");
            }
        }
    }

    public static void compareNumbers() {
        int a = 20;
        int b = 102;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean includeSumInInterval(int first, int second) {
        int sum = first + second;
        return ((sum >= 10) && (sum <= 20));
    }

    public static void checkNumberSign(int number) {
        if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }

    public static boolean isNegative(int number) {
        return (number < 0);
    }

    public static void printSentence(String sentence, int count) {
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                System.out.println(sentence);
            }
        }
    }

    public static boolean isLeapYear(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

    public static void createBinaryArray() {
        byte[] arr = {0, 1, 0, 1, 1, 1, 0, 0, 0, 1, 0, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void createArray() {
        int[] array = new int[100];
        for (int i = 0; i < array.length; ) {
            array[i] = ++i;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void multiplyArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void createArrayWithDiagonale() {
        int[][] table = new int[5][5];
        for (int i = 0; i < table.length; i++) {
            table[i][i] = 1;
            table[i][table.length - 1 - i] = 1;
        }


        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(" " + table[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int [] getArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
