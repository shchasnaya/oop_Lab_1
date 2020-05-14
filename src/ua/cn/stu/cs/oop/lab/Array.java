package ua.cn.stu.cs.oop.lab;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args){
        //Вводимо довжину масиву
        Scanner scan = new Scanner(System.in);
        System.out.println("Введіть довжину масиву");
        int size = scan.nextInt();
        scan.close();

        //Формуємо масив
        double[] arr = new double[size];

        //Заносимо випадкові числа
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = Math.random()*100;
        }

        //Сортуємо масив
        Arrays.sort(arr);

        //Виводимо масив за допомогою foreach
        System.out.println("Ось числа масиву: ");
        for(double d : arr)
        {
            System.out.printf("%6.2f", d);
        }
        System.out.println();
    }
}
