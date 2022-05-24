package com.pearFruitNote;
import java.util.Scanner;

public class GameMenu {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            MenuTwo two = new MenuTwo();
            MagicBall mag = new MagicBall();
            MenuOne menu = new MenuOne();
            Calculator calc = new Calculator();

            while (true) {
                menu.menu();
                String choiceMenu = scan.nextLine();
                if (choiceMenu.equals("0"))
                    break;
                switch (choiceMenu) {
                    case "1":
                        mag.ball();
                        break;
                    case "2":
                        calc.calc();
                        break;
                    case "3":
                        two.two();
                        break;
                    default:
                        System.out.println("\t!!!!!Такого номера не существует!!!!!");
                        break;
                }
            }
            System.out.println("\t\t\t\t\t\t!!!ПОКА!!!");
            scan.close();
        }
    }