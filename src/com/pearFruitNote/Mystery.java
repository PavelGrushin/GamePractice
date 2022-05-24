package com.pearFruitNote;

import java.util.Scanner;

public class Mystery {

    Scanner scan = new Scanner(System.in);

    public void question() {
        System.out.println("\t\t\t***ЗАГАДКА***\nЧто это такое: синий, большой, с усами и полностью набит зайцами?");
        System.out.println("Напиши ответ либо Напиши слово <<СДАЮСЬ>>");
        while (true) {
            String text = scan.nextLine();
            if (text.equalsIgnoreCase("exit"))
                break;
            if (text.equalsIgnoreCase("троллейбус")) {
                System.out.println("\t\t\t<<!!!ДА, ТЫ УГАДАЛ!!!>>\n");
                break;
            } else if (text.equalsIgnoreCase("сдаюсь")) {
                System.out.println("Правильный ответ - ТРОЛЛЕЙБУС!\n");
                break;
            } else {
                System.out.println("Попробуй ещё раз!");
                System.out.println("Для выхода напишите <<EXIT>>!");
                continue;
            }
        }
    }

    public void question2() {
        System.out.println("\t\t\t***ЗАГАДКА***\nЧто это такое: Тысяча одёжек и все без застежек?");
        System.out.println("Напиши ответ либо Напиши слово <<СДАЮСЬ>>");
        while (true) {
            String text = scan.nextLine();
            if (text.equalsIgnoreCase("exit"))
                break;
            if (text.equalsIgnoreCase("капуста")) {
                System.out.println("\t\t\t<<!!!ДА, ТЫ УГАДАЛ!!!>>\n");
                break;
            } else if (text.equalsIgnoreCase("сдаюсь")) {
                System.out.println("Правильный ответ - КАПУСТА!\n");
                break;
            } else {
                System.out.println("Попробуй ещё раз!");
                System.out.println("Для выхода напишите <<EXIT>>!");
                continue;
            }
        }
    }

    public void question3() {
        System.out.println("\t\t\t***ЗАГАДКА***\nЧто это такое: Деревянный пирожок, а начинка мясо?");
        System.out.println("Напиши ответ либо Напиши слово <<СДАЮСЬ>>");
        while (true) {
            String text = scan.nextLine();
            if (text.equalsIgnoreCase("exit"))
                break;
            if (text.equalsIgnoreCase("гроб")) {
                System.out.println("\t\t\t<<!!!ДА, ТЫ УГАДАЛ!!!>>\n");
                break;
            } else if (text.equalsIgnoreCase("сдаюсь")) {
                System.out.println("Правильный ответ - ГРОБ!\n");
                break;
            } else {
                System.out.println("Попробуй ещё раз!");
                System.out.println("Для выхода напишите <<EXIT>>!");
                continue;
            }
        }
    }
}