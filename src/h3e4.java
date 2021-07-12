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
        int b=4;
        for (int i = 0; i <= b; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i - j + " ");
            }
            System.out.println();
        }
    }
}
