/*
Напечатать числа в виде таблицы (на выбор, «а» или/и «б»):
а).
0
1 0
2 1 0
3 2 1 0
4 3 2 1 0

 */
public class h3e4 {
    public static void main(String[] args) {

        int i, j=0, a = 0;

        for (i = 0; i <= 5; i++) {

            for (j=i-1; j >= 0; j--) {
                System.out.print(j + " ");
                if (i == j) break;
            }

            System.out.println();
        }
    }
}
