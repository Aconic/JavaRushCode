package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));  //Напишите тут ваш код
     String s = in.readLine();
        return s;
    }

    public static int readInt() throws Exception
    {
        Scanner sc = new Scanner(System.in); //Напишите тут ваш код
        int d = sc.nextInt();
        return d;
    }

    public static double readDouble() throws Exception
    {
       Scanner sc = new Scanner(System.in);//Напишите тут ваш код
       double e = sc.nextDouble();
        return e;
    }

    public static void readLn() throws Exception
    {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        while  (in.read() != '\n')
        {
        ;
        }//Напишите тут ваш код
        }

    }

