package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        int aN= Integer.parseInt(a);
        int bN= Integer.parseInt(b);
        if (aN > bN)
        {
            System.out.print(bN);
        }
        else System.out.print(aN);
        //Напишите тут ваш код

    }
}