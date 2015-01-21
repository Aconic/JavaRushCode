package com.javarush.test.level05.lesson05.task04;

/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/
public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Васька", 2);
        Cat cat2 = new Cat("Мурзик", 1 );
        Cat cat3 = new Cat("Урка", 3);
    }

    public static class Cat {

        public static int count = 0;
        private String name;
        private int age;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
          }
    }
}
