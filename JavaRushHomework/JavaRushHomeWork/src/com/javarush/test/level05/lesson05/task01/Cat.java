package com.javarush.test.level05.lesson05.task01;

/* Создать класс Cat
Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

    public static void main(String[] args)
    {
    Cat catV = new Cat();
    catV.name  = "Vaska";
    catV.age = 4;
    catV.weight = 6;
    catV.strength = 12;
    }
}
