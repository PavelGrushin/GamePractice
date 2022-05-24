package com.pearFruitNote;

import java.util.Scanner;

public class MenuTwo {
    public void two() {
        Scanner scan = new Scanner(System.in);
        Mystery ques1 = new Mystery();
        Mystery ques2 = new Mystery();
        Mystery ques3 = new Mystery();
        while (true) {
            System.out.println("\n\t\t\t\t\t***MENU MYSTERY***\n");
            System.out.println("Для выбора загадки введите её номер!\n");
            System.out.println("\t\t\t\t\tQESTION: 1 -----> 1\n\t\t\t\t\tQESTION: 2 -----> 2");
            System.out.println("\t\t\t\t\tQESTION: 3 -----> 3\n\t\t\t\t\tEXIT --------------> 0");
            String choiceMenuTwo = scan.nextLine();
            if (choiceMenuTwo.equals("0"))
                break;
            switch (choiceMenuTwo) {
                case "1":
                    ques1.question();
                    break;
                case "2":
                    ques2.question2();
                    break;
                case "3":
                    ques3.question3();
                    break;
                default:
                    System.out.println("\t!!!!!Такого номера не существует!!!!!");
                    break;
            }
        }
    }
}
