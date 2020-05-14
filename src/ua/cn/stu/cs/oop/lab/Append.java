package ua.cn.stu.cs.oop.lab;

import java.util.Scanner;

public class Append {
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Введіть дані за шаблоном\n");
        sb.append("Призвище та ім'я/кількість незадовільних оцінок./середній бал/\n");
        sb.append("Наприклад:\nКіт Базіліо/2/2,4/");
        //Виводимо вмыст стрінгбуферу
        System.out.println(sb);
        //Далі програма очікує на введення даних з консолі
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("/");
        String name = sc.next();
        int n = sc.nextInt();
        float b = sc.nextFloat();
        sc.close();
        //Виведення отриманних даних
        System.out.println(name + ": двійок " + n + "; cр.бал: " + b);
    }

}
