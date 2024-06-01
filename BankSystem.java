package Tubes;

import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TambahNasabah tambahNasabah = new TambahNasabah(100); //asumsi maksimal nasabah 100

        while (true) {
            System.out.println("1. Tambah Nasabah");
            System.out.println("2. Hapus Nasabah");
            System.out.println("3. Tampilkan Daftar Nasabah");
            System.out.println("4. Keluar");
            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine();

            switch (opsi) {
                case 1:
                    System.out.print("Nama Nasabah: ");
                    String deskripsi = scanner.nextLine();
                    System.out.print("Nomor Rekening: ");
                    int rekening = scanner.nextInt();
                    tambahNasabah.tambahNasabah(deskripsi, rekening);
                    break;
                case 2:
                    DataNasabah topTransaksi = tambahNasabah.top();
                    if (topTransaksi != null) {
                        System.out.println("Nasabah yang akan dihapus: " + topTransaksi);
                        System.out.print("Apakah Anda yakin ingin menghapus nasabah ini? (ya/tidak): ");
                        String konfirmasi = scanner.nextLine();
                        if (konfirmasi.equalsIgnoreCase("ya")) {
                            DataNasabah dibatalkan = tambahNasabah.batalkanNasabah();
                            System.out.println("Nasabah telah dihapus: " + dibatalkan);
                        } else {
                            System.out.println("Penghapusan dibatalkan.");
                        }
                    } else {
                        System.out.println("Tidak ada nasabah untuk dihapus.");
                    }
                    break;
                case 3:
                    tambahNasabah.tampilkanNasabah();
                    break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan sistem kami!");
                    System.exit(0);
                default:
                    System.out.println("Opsi tidak valid, coba lagi.");
            }
        }
    }
}
