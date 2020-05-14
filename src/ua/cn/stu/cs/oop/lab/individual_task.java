package ua.cn.stu.cs.oop.lab;

import java.util.Scanner;

public class individual_task {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        boolean flag = false;
        //Вводимо ім'я студенту
        System.out.println("Введіть прізвище студенту");
        String name_string = name.nextLine();
        //name.close();
        //Scanner name = new Scanner(System.in);
        while(!flag)
        {
            //Вводимо бюджет/контракт
            System.out.println("Введіть б, якщо бюджет; к - контракт");
            char state_char = name.next().toCharArray()[0];
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

        System.out.println("Введіть кількість предеметів");
        int size = name.nextInt();

        System.out.println("Введіть результи сесії у балах ECTS через пробіл");

        int[] array = new int[size];
        int[] scale = new int[size];
        for(int j = 0; j < size; j++)
        {
            array[j] = name.nextInt();
        }
        System.out.println("Результати сесії за національною шкалою: ");
        int sum = 0;
        for(int i = 0; i < size; i++)
        {

            if(array[i] <= 100 && array[i] >=90)
            {
                scale[i] = 5;
            }
            else if(array[i] <= 89 && array[i] >= 75)
            {
                scale[i] = 4;
            }
            else if(array[i] <= 74 && array[i] >= 66)
            {
                scale[i] = 3;
            }
            else if(array[i] <= 65 && array[i]  >= 60)
            {
                scale[i] = 2;
            }
            else
            {
                System.out.println("Студент не має права отримувати стипендію, оскільки за екзамен отримано незадовільно");
                flag = false;
                break;
            }
            sum += scale[i];
            System.out.print(scale[i] + " ");
        }
        int rezult = sum/size;
        if(flag == true && (rezult >= 4 ))
        {
            System.out.println("Студент отримуватиме стипендію, оскільки його середній бал більше 4, а саме " + rezult);
        }
        else
        {
            System.out.println("Студент не має права отримувати стипендію, оскільки його середній бал менше 4, а саме " + rezult);
        }

    }
}
