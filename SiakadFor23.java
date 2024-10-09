import java.util.Scanner;

public class SiakadFor23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0; 

        for (int i = 1; i <= 10; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = input.nextDouble();

            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }

            if (nilai >= 60) {
                lulus++;
            }else{
                tidakLulus++;
            }
        }

        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
        System.out.println("Jumlah Mhs Lulus: " +lulus);
        System.out.println("Jumlah Mhs Tidak Lulus: " +tidakLulus);
    }
}