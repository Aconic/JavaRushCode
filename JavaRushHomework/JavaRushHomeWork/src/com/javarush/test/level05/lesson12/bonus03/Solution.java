package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        int digit;
        int N = Integer.parseInt(reader.readLine());

        if (N > 0)
        {

        maximum = Integer.parseInt(reader.readLine());              //максимуму присваивается первый элемент
        for(int i = 1; i < N; i++){
            digit = Integer.parseInt(reader.readLine());
            if(digit>maximum){
                maximum = digit;
            }
        }

        System.out.println(maximum);
         }
    }
}


