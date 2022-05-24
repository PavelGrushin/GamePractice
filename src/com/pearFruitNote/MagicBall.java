package com.pearFruitNote;

import java.util.Scanner;

public class MagicBall {
    public void ball(){
        Scanner scan = new Scanner(System.in);
        System.out.println("<<Магический Шар>>");
        boolean exit = false;
        while (!exit) {
            System.out.println("Задай вопрос в слух и нажми ENTER!");
            for (int x = 0; x < 1; x++) {
                String enter = scan.nextLine();
                int ran = (int) (Math.random() * 20);
                switch (ran) {
                    case 0:
                        System.out.println("\t\t<<Бесспорно>>\n".toUpperCase());
                        break;
                    case 1:
                        System.out.println("\t\t<<Предрешено>>\n".toUpperCase());
                        break;
                    case 2:
                        System.out.println("\t\t<<Никаких сомнений!>>\n".toUpperCase());
                        break;
                    case 3:
                        System.out.println("\t\t<<Определённо да>>\n".toUpperCase());
                        break;
                    case 4:
                        System.out.println("\t\t<<Можешь быть уверен в этом>>\n".toUpperCase());
                        break;
                    case 5:
                        System.out.println("\t\t<<Мне кажется — «да»>>\n".toUpperCase());
                        break;
                    case 6:
                        System.out.println("\t\t<<Вероятнее всего>>\n".toUpperCase());
                        break;
                    case 7:
                        System.out.println("\t\t<<Хорошие перспективы>>\n".toUpperCase());
                        break;
                    case 8:
                        System.out.println("\t\t<<Знаки говорят — «да»>>\n".toUpperCase());
                        break;
                    case 9:
                        System.out.println("\t\t<<Да>>\n".toUpperCase());
                        break;
                    case 10:
                        System.out.println("\t\t<<Пока не ясно, попробуй снова>>\n".toUpperCase());
                        break;
                    case 11:
                        System.out.println("\t\t<<Спроси позже>>\n".toUpperCase());
                        break;
                    case 12:
                        System.out.println("\t\t<<Лучше не рассказывать>>\n".toUpperCase());
                        break;
                    case 13:
                        System.out.println("\t\t<<Сейчас нельзя предсказать>>\n".toUpperCase());
                        break;
                    case 14:
                        System.out.println("\t\t<<Сконцентрируйся и спроси опять>>\n".toUpperCase());
                        break;
                    case 15:
                        System.out.println("\t\t<<Даже не думай>>\n".toUpperCase());
                        break;
                    case 16:
                        System.out.println("\t\t<<Мой ответ — «нет»>>\n".toUpperCase());
                        break;
                    case 17:
                        System.out.println("\t\t<<По моим данным — «нет»>>\n".toUpperCase());
                        break;
                    case 18:
                        System.out.println("\t\t<<Перспективы не очень хорошие>>\n".toUpperCase());
                        break;
                    case 19:
                        System.out.println("\t\t<<Весьма сомнительно>>\n".toUpperCase());
                        break;
                    default:
                        System.out.println("\t\t!!!ОШИБКА!!!\n".toUpperCase());
                }
                System.out.println("Чтобы выйти пропиши Exit!");
                System.out.println("Чтобы повторить нажми ENTER!");
            }
            exit = scan.nextLine().equalsIgnoreCase("exit");
        }
    }
}
