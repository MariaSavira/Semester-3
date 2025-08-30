
import java.util.Scanner;

public class Praktikum1 {

    static Scanner scan = new Scanner(System.in);
    static String[] namaKue = new String[10];
    static String[] rasa = new String[10];
    static String[] tglKadaluarsa = new String[10];

    public static void main(String[] args) {

        namaKue[0] = "Tango";
        rasa[0] = "Coklat";
        tglKadaluarsa[0] = "12 Mei 2025";

        namaKue[1] = "Aoka";
        rasa[1] = "Pandan";
        tglKadaluarsa[1] = "23 Agustus 2025";

        namaKue[2] = "Go Potato";
        rasa[2] = "Kentang";
        tglKadaluarsa[2] = "30 Agustus 2025";

        namaKue[3] = "Cornetto";
        rasa[3] = "Stroberi";
        tglKadaluarsa[3] = "17 Agustus 2025";

        namaKue[4] = "Waffer";
        rasa[4] = "Pandan";
        tglKadaluarsa[4] = "19 Agustus 2025";

        namaKue[5] = "Aoka";
        rasa[5] = "Vanilla";
        tglKadaluarsa[5] = "30 Agustus 2025";

        namaKue[6] = "Aoka";
        rasa[6] = "Stroberi";
        tglKadaluarsa[6] = "21 Agustus 2025";

        namaKue[7] = "Aoka";
        rasa[7] = "Coklat";
        tglKadaluarsa[7] = "20 Agustus 2025";

        namaKue[8] = "Roti Boy";
        rasa[8] = "Moka";
        tglKadaluarsa[8] = "10 Agustus 2025";

        namaKue[9] = "Chocolatos";
        rasa[9] = "Coklat";
        tglKadaluarsa[9] = "12 Agustus 2025";

        tampilkanDaftarKue();

        gantiInformasiKue();

        tampilkanDaftarKue();
    }

    static void tampilkanDaftarKue() {
        System.out.println("\n======= Tampilkan Daftar Kue =======");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ". " + namaKue[i]);
            System.out.println("Rasa : " + rasa[i]);
            System.out.println("Kadaluarsa : " + tglKadaluarsa[i]);
        }
    }

    static void gantiInformasiKue() {
        System.out.println("\n======= Ganti Nama Kue =======");
        System.out.print("Masukkan index (0-9) : ");
        int index = scan.nextInt();
        scan.nextLine();
        System.out.print("Masukkan nama Kue yang baru : ");
        namaKue[index] = scan.nextLine();
        System.out.print("Masukkan rasa : ");
        rasa[index] = scan.nextLine();
        System.out.print("Masukkan tanggal kadaluarsa : ");
        tglKadaluarsa[index] = scan.nextLine();
    }
}
