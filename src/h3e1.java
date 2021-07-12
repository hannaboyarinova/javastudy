import java.util.Scanner;

/*
Дано целое число a. Определить число вхождений в него цифры b.
Можно ли для этого использовать цикл for? Перепишите ее для всех
возможных видов циклов
 */
public class h3e1 {

    public static void main(String[] args) {

        int a = 121, b = 11, c = a;
        int i;

       for (i = 0; a/b > 0; i++) {
            a -= b;
        }
        System.out.println("Number " + c + " contains " + i + " numbers " + b);



       // while (a/b > 0) {
       //     a -= b;
        //    i++;
        //}
        //System.out.println("Number " + c + " contains " + i + " numbers " + b);
    }
}
