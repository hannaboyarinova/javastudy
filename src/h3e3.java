/*
Напишите приложение, которое определяет через сколько целых лет
вложенная в банк сумма s под n процентов годовых достигнет
заданного значения. Можно ли для завершения расчета
накопленной суммы использовать оператор break, break с меткой,
return? Вызов System.exit() ? Убедитесь в этом.
 */
import java.util.Scanner;
public class h3e3 {
    public static void main(String[] args) {

        int i;

        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter start deposite sum: ");
        double s = sc1.nextDouble();

        Scanner sc2 = new Scanner(System.in);
        System.out.print("Enter percent: ");
        double n = sc2.nextDouble();

        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter expected sum: ");
        double e = sc3.nextDouble();

        for (i=0; s<e; i++){
            s += + s*n/100;
            System.out.println(s);
        }
        System.out.println("The deposit will reach the desired amount in " + i + " year");

    }

}
