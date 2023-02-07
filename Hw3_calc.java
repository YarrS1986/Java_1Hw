
//Реализовать простой калькулятор (пользователь вводит 2 числа и вводит операцию (+ - / *).
//        int a ; int b; String op (op!=”Stop”); (char != ’b’)

import java.util.Scanner;

public class Hw3_calc {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        boolean check = true;
        try {
            while (check) {
                System.out.printf("Введи первое целое число -> ");
                String A = iScanner.nextLine();
                Integer a = Integer.parseInt(A);
                System.out.printf("Введи действие ( + - * / ): ");
                String action = iScanner.nextLine();
                System.out.printf("Введи второе целое число -> ");
                String B = iScanner.nextLine();
                Integer b = Integer.parseInt(B);
                if (action.charAt(0) == '+') System.out.println("Ответ = " + (a + b));
                else if (action.charAt(0) == '-') System.out.println("Ответ = " + (a - b));
                else if (action.charAt(0) == '*') System.out.println("Ответ = " + (a * b));
                else if (action.charAt(0) == '/') System.out.println("Ответ = " + ((float) a / (float) b));
                System.out.printf("Желаете продолжить (y/n)? ");
                String nextHop = iScanner.nextLine();
                if (nextHop.toLowerCase() == "n") check = false;     //почему то не выходит из цикла
            }
        } catch (Exception e) {
            System.out.println("Введи верное значение ! ");
            check = false;
        }
        iScanner.close();
    }
}

