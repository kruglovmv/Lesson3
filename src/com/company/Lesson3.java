package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {

       task1();
       task2();
    }

    public static void task1() {
        System.out.println("Task №1. Угадай число за три попытки");
        Scanner scanner = new Scanner(System.in);
        for (; ; ) {
            int number = new Random().nextInt(10);
            int i = 1;
            do {
                System.out.println("Попытка №" + i);
                System.out.println("Ведите число от 0 до 9");
                int answer = scanner.nextInt();
                if (answer > number)
                    System.out.println("Вы не угадали. Загаданное число несколько меньше!!!");
                else if (answer < number) System.out.println("Вы не угадали. Загаданное число несколько больше!!!");
                else {
                    System.out.println("Вы угадали. Загаданное число " + number);
                    break;
                }
                i++;
            } while (i <= 3);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            int answer = scanner.nextInt();
            switch (answer) {
                case 1:
                    break;
                case 0: {
                    System.out.println("Игра окончена!");
                    return;
                }
                default: {
                    {
                        System.out.println("Игра окончена! Вы неправильно ввели число для выхода.");
                        return;
                    }
                }
            }
        }
    }

    public static void task2() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println("Task №2. Угадай слово:");
        System.out.println("Необходимо угадать какое слово загадано компьютером из приведенного ниже набора слов.");
        System.out.println(Arrays.toString(words));

        int count = new Random().nextInt(25);
        Scanner scanner = new Scanner(System.in);
        String word = words[count];
            for (; ; ) {
            System.out.println("Введите слово-ответ");
            String answer = scanner.nextLine();
            if (answer.equals(word)) {
                System.out.println("Вы угадали!!!");
                return;
            }
            else {count = Math.min(answer.length(), word.length());
                StringBuilder out = new StringBuilder();
                for (int i = 0; i < count; i++) {
                    if (answer.charAt(i)==word.charAt(i)) out.append(word.charAt(i));
                    else out.append("*");
                }
                while (out.length()<16){
                    out.append("*");
                }
                System.out.println("Вы не угадали!!! Возможно Вам повезло и есть буквы, которые совпали в Вашем и загаданном слове -"+ out.toString());
            }
        }
    }
}
