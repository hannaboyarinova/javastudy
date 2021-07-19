/*
Дано целое число a. Определить число вхождений в него цифры b.
Можно ли для этого использовать цикл for? Перепишите ее для всех
возможных видов циклов

через for/while/do while + massive

 */
import java.util.Scanner;

public class h3e11 {
    public static void main(String[] args) {

        int j = 0;
        int l, z, m = 0;

        Scanner sc4 = new Scanner(System.in);
        System.out.print("Input long number: ");
        int a = sc4.nextInt();
        l = a;
        z = a;

        Scanner sc5 = new Scanner(System.in);
        System.out.print("Input digit: ");
        int b = sc5.nextInt();

        while (a > 0) { //подсчет длины числа
            a /= 10;
            j++;
        }

        int[] s = new int[j];
        for (int i = 0; i < j; i++) {
             s[i] = l % 10; //заполняем массив элементами
             if (s[i] == b) //сверяем элемент массива с числом, кол-во которого надо найти
                m++;
             l /= 10;
        }
        System.out.println("Number " + z + " contains " + m + " digits " + b);


         /*  int i = 0;
        while (i < j){
            s[i] = l%10; //заполняем массив элементами
            if (s[i] == b) //сверяем элемент массива с числом, кол-во которого надо найти
                m++;
            l/= 10;
            i++;
        }
        System.out.println("Number " + z + " contains " + m + " digits " + b);

       /* int i = 0;
        do{
            s[i] = l%10; //заполняем массив элементами
            if (s[i] == b) //сверяем элемент массива с числом, кол-во которого надо найти
                m++;
            l/= 10;
            i++;
        } while (i<j);
        System.out.println("Number " + z + " contains " + m + " digits " + b);

        */
        }
    }