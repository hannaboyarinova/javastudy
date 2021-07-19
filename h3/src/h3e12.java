/*
Дано целое число a. Определить число вхождений в него цифры b.
Можно ли для этого использовать цикл for? Перепишите ее для всех
возможных видов циклов

через for + String
 */

public class h3e12 {
    public static void main(String[] args) {

        int a = 111223;
        int b = 1, count = 0;
        String str = Integer.toString(a);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == (b + '0')) //сверяем элемент массива с числом, кол-во которого надо найти
                count++;
        }
        System.out.println("Number " + a + " contains " + count + " digits " + b);
    }
}