package com.pearFruitNote;

import java.util.Scanner;

public class Calculator {

    public void calc() {
        Scanner text = new Scanner(System.in);
        Scanner num = new Scanner(System.in);

        System.out.println("\t\t<<Лёгкий Калькулятор>>");
        boolean isExit = false;
        while (!isExit) {
            System.out.print("Введите Первое Целое число: ");
            int num1 = num.nextInt();
            System.out.print("Введите один из символов (+)(-)(*)(/): ");
            String sign = text.nextLine();
            System.out.print("Введите Второе Целое число: ");
            int num2 = num.nextInt();
            switch (sign) {
                case "+":
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case "-":
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case "*":
                    System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case "/":
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                default:
                    System.out.println("\t\t!!!НЕ КОРРЕТНЫЙ ВВОД!!!");
            }
            System.out.println("Для Выхода Напишите <<EXIT>>\nДля Повтора Нажмите <<ENTER>>");
            isExit = text.nextLine().equalsIgnoreCase("Exit");
        }
    }
}