import java.util.Scanner;

public class ForKelipatan27 {
    public static void main(String[] args) {

        Scanner input27 = new Scanner(System.in);

        int kelipatan, jumlah, counter;

        jumlah = 0;
        counter = 0;

        System.out.print("Masukkan Bilangan Kelipatan (1-9) : ");
        kelipatan = input27.nextInt();

        for (int a1 = 1 ; a1 <= 50 ; a1++) {
            if (a1 % kelipatan == 0) {
                jumlah += a1;
                counter++;

            }
                System.out.printf("Banyaknya Bilangan %d Dari 1 Sampai 50 adalah %d\n",kelipatan,counter);
                System.out.printf("Total Bilangan Kelipatan %d Dari 1 Sampai 50 adalah %d\n",kelipatan,jumlah);

        }

    }
}