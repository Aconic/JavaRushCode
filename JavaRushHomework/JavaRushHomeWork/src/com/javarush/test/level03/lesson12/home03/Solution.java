package com.javarush.test.level03.lesson12.home03;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();//считываем целое число a
        int b = in.nextInt();//считываем целое число b
        System.out.print(a+b);//выводим сумму a+b
    }
}