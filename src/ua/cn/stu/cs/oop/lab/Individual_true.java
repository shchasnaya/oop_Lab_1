package ua.cn.stu.cs.oop.lab;

import java.util.ArrayList;
import java.util.Scanner;

public class Individual_true {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        boolean flag = false;
        //Вводимо ім'я студенту
        System.out.println("Введіть прізвище студенту");
        String name_string = name.nextLine();

        while(!flag)
        {
            //Вводимо бюджет/контракт
            System.out.println("Введіть б, якщо бюджет; к - контракт");
            char state_char = name.nextLine().toCharArray()[0];
            //нужно ли каждый раз закрывать сканер??
            if(state_char == 'б')
            {
                flag = true;
            }
            else if(state_char == 'к') {
                flag = true;
                System.out.println("Студент не має права отримувати стипендію, оскільки вчиться на контракті");
                return;
            }
            else
            {
                System.out.println("Помилка при вводі даних");
            }
        }
        System.out.println("Введіть результи сесії у балах ECTS через пробіл");
        ArrayList<Integer> marks = new ArrayList<Integer>();

        for(String i: name.nextLine().split(" "))
        {
            switch (i)
            {
                case "A": {
                    marks.add(5);
                    break;
                }
                case "B":
                case "C":
                {
                    marks.add(4);
                    break;
                }
                case "D":
                case "E":
                {
                    marks.add(3);
                    break;
                }
                case "Fx":
                {
                    marks.add(0);
                    break;
                }
                default: {
                    System.out.println("Оцінки ввдено неправильно");
                    return;
                }
            }
        }
        //System.out.println("Результати сесії за національною шкалою: ");
        StringBuilder str = new StringBuilder("Результати сесії за національною шкалою: ");
        for(int i : marks)
        {
            if(i < 4)
            {
                flag = false;
            }
            str.append(i);
            str.append(", ");
        }
        if(flag)
        {
            str.append("\nСтудент отримуватиме стипендію" );
        }
        else
        {
            str.append("\nСтудент не має права отримувати стипендію");
        }
        System.out.println(str);
        name.close();
    }
}

