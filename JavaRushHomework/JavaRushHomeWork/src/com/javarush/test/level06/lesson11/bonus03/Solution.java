package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] ar = new int[5];
        //Напишите тут ваш код

        for (int i = 0; i < ar.length; i++)
        {
            ar[i] = Integer.parseInt(reader.readLine());

        }
        int tmp = 0;

        for (int i = 0; i < ar.length; i++)
        {

            for (int j = 0; j < ar.length - i - 1; j++)
            {
                if (ar[j] > ar[j + 1])
                {
                    tmp = ar[j+1];
                    ar[j+1] = ar[j];
                    ar[j] = tmp;
                }

            }

        }

        for (int i = 0; i < ar.length; i++)
        {
            System.out.println(ar[i]);

        }



    }
}
