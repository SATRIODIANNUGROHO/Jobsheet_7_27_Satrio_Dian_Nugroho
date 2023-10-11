import java.util.Scanner;

public class DoWhileCuti27 {
    public static void main(String[] args) {

        Scanner input27 = new Scanner(System.in);

        int jatahCuti, jumlahHari;
        String konfirmasi;

        System.out.print("Jatah Cuti : ");
        jatahCuti = input27.nextInt();

        do {
            System.out.print("Apakah Anda Ingin Mengambil Cuti (y/t) ? ");
            konfirmasi = input27.next();

            if (konfirmasi.equalsIgnoreCase("y")) {
                System.out.print("Jumlah Hari : ");
                jumlahHari = input27.nextInt();

                if (jumlahHari <= jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa Jatah Cuti : " + (jatahCuti) + " Hari");
                } else {
                    System.out.println("Sisa Jatah Cuti Anda Tidak Mencukupi");
                    break;
                }

            }

        }while (jatahCuti > 0);

    }
}
