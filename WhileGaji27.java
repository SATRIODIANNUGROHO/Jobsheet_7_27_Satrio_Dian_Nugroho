import java.util.Scanner;

public class WhileGaji27 {
    public static void main(String[] args) {

        Scanner input27 = new Scanner(System.in);

        int jumlahKaryawan, jumlahJamLembur;
        double gajiLembur, totalGajiLembur;

        gajiLembur = 0;
        totalGajiLembur = 0;

        String Jabatan;

        System.out.print("Masukkan Jumlah Karyawan : ");
        jumlahKaryawan = input27.nextInt();

        int a1 = 0;

        while (a1 < jumlahKaryawan) {
            System.out.println("Pilihan Jabatan - Direktur, Manajer, Karyawan");
            System.out.print("Masukkan Jabatan Karyawan Ke - " + (a1+1) + " : ");
            Jabatan = input27.next();
            System.out.print("Masukkan Jumlah Jam Lembur : ");
            jumlahJamLembur = input27.nextInt();
            a1++;

            if (Jabatan.equalsIgnoreCase("direktur")) {
                continue;
            }else if (Jabatan.equalsIgnoreCase("manajer")) {
                gajiLembur = jumlahJamLembur * 100000;
            }else if (Jabatan.equalsIgnoreCase("karyawan")) {
                gajiLembur = jumlahJamLembur * 75000;
            }
            totalGajiLembur += gajiLembur;
            System.out.println("Total Gaji Lembur : " + (totalGajiLembur));
        }

    }
}
