package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/


import java.util.Scanner;

    public class Solution
    {
        public static void main(String[] args) throws Exception
        {
            Scanner reader = new Scanner (System.in);
            int a = reader.nextInt(), b = reader.nextInt(), c = reader.nextInt(), d = reader.nextInt() ;
            if (a > b && a > c && a > d)
            {
                System.out.print (a);
            }
            else if (b > a && b > c && b > d)
            {
                System.out.print (b); }

            else if (c > a && c > b && c > d)
            {
                System.out.print (c);
            }
            else System.out.print (d);
        }
    }