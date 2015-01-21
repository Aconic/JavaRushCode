package com.javarush.test.level05.lesson12.home02;

/* Man and Woman
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name(String), age(int), address(String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате [name + " " + age + " " + address].
*/

public class Solution
{
    public static void main(String[] args)
    {

        // Создай по два объекта каждого класса тут
        Man man1 = new Man();
        Man man2 = new Man();
        Woman woman1 = new Woman();
        Woman woman2 = new Woman();
        // Выведи их на экран тут
        System.out.print(man1);
        System.out.print(man2);
        System.out.print(woman1);
        System.out.print(woman2);

    }

    public static class Man{
       public String name;
       public String address;
        public int age;
        public String toString()
        {
            return (name + " " + age + " " + address);
        }
        }

    public static class Woman{
        public String name;
        public String address;
        public int age;
        public String toString()
        {
            return (name + " " + age + " " + address);
        }

        }
}



