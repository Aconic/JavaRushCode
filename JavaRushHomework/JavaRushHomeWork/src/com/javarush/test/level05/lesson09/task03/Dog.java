package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
   private String name, color;
    private  int age, height;
    //Напишите тут ваш код
   public Dog(String name)
   {
       this.name = name;
   }

   public Dog(String name, int height)
   {
       this.name = name;
       this.height = height;
   }
   public Dog(String name, int height, int age)
   {
        this.name = name;
        this.height = height;
       this.age = age;
   }

}
