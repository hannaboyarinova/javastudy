/*
Откройте файл RDN.java. Какую задачу решает содержащаяся в нем
программа? Структурируйте программу, то есть составьте ее без
использования операторов передачи управления (break и
continue)
 */
import java.util.Scanner;

public class h3e5 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int enteredNum;
        int currentNum;
        int currentNum1;

        do {
            for (; ; ) {

                System.out.print("Enter an integer: ");
                enteredNum = sc.nextInt();
                System.out.print("Thanks! And now, guess the number you entered");

                do {
                    System.out.print("Enter an integer: ");
                    currentNum = sc.nextInt();

                    if (currentNum == enteredNum) {
                    } else if (currentNum > enteredNum) {
                        System.out.print("Too much!");
                    } else if (currentNum < enteredNum) {
                        System.out.print("Not enough!");
                    }
                } while (currentNum != enteredNum);
                System.out.print("Do you wish to continue? (Enter any key to continue, 0 - to finish)");
                currentNum1 = sc.nextInt();
            }}
            while (currentNum != 0) ;

    } // end of main
}// end of class