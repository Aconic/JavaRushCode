package com.javarush.test.level07.lesson09.task03;

import java.util.ArrayList;/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> list = new ArrayList<String>();

        String s = "именно";
        list.add("мама");
        list.add("мыла");
        list.add("раму");
        list.add(1,s);
        list.add(3,s);
        list.add(5,s);

        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));

        }
        //Напишите тут ваш код

    }
}