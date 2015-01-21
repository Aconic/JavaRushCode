package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
       Scanner in = new Scanner (System.in);
        int d = in.nextInt();
        int e = in.nextInt();
        int f = in.nextInt();
        ShowMin (d, e, f);
    }
        public static void ShowMin (int a, int b, int c)
        {
            int tmp;
            if (a < b)
            {
                tmp = a;
                a = b;
                b = tmp;
            }

            if (a < c)
            {
                tmp = a;
                a = c;
                c = tmp;
            }

            if (b < c)
            {
                tmp = b;
                b = c;
                c = tmp;
            }

            System.out.println(a + " " + b +" "+ c);
        }
    }


