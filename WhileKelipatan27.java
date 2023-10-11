import java.util.Scanner;

public class WhileKelipatan27 {
    public static void main(String[] args) {

        Scanner input27 = new Scanner(System.in);

        int kelipatan,jumlah,counter;
        jumlah = 0;
        counter = 0;
        float average = 0F;

        System.out.print("Masukkan Bilangan Kelipatan (1-9) : ");
        kelipatan = input27.nextInt();

        int a1 = 1;

        while (a1 <= 50) {
            if (a1 % kelipatan == 0) {
                jumlah += a1;
                counter++;
                average = (float) jumlah / counter;
            }
        System.out.printf("Banyaknya Bilangan %d Dari 1 Sampai 50 Adalah %d\n",kelipatan,counter);
        System.out.printf("Total Bilangan Kelipatan %d Dari 1 Sampai 50 Adalah %d\n",kelipatan,jumlah);
        System.out.printf("Rata-Rata Dari Total Kelipatan %d Dari 1 Sampai 50 Adalah %f\n\n",kelipatan,average);
        a1++;
        }

    }
}
