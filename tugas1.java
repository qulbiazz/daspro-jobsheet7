import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int hargaTiket = 50000, jml_tiketBeli = 0, jml_tiketTerjual = 0;
        double penjualanSehari = 0, diskon = 0.0, totalDiskon, hargaHarian;
        int jumlahPelanggan, i = 0;

        System.out.print("Masukkan Jumlah Pelanggan Per Hari: ");
        jumlahPelanggan = input.nextInt();

        while (i < jumlahPelanggan) {
            System.out.print("Masukkan Jumlah Tiket Pelanggan ke- " + (i + 1) + ": ");
            jml_tiketBeli = input.nextInt();
            jml_tiketTerjual += jml_tiketBeli;

            if (jml_tiketBeli < 0) {
                System.out.println("Jumlah Tiket Tidak Valid");
                continue;
            }
            
            if (jml_tiketBeli > 10) {
                diskon = 0.15;
            }else if (jml_tiketBeli > 4) {
                diskon = 0.1;
            }else{
                diskon = 0.0;
            }

            totalDiskon = jml_tiketBeli * hargaTiket * diskon;
            hargaHarian = jml_tiketBeli * hargaTiket - totalDiskon;
            penjualanSehari += hargaHarian;

            i++;
        }

        System.out.println("Jumlah Tiket Terjual: " + jml_tiketTerjual);
        System.out.println("Total Penjualan Tiket Sehari: " + penjualanSehari);

    }
}
