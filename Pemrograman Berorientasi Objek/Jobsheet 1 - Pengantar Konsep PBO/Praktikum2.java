
import java.util.Scanner;

public class Praktikum2 {

    static Scanner scan = new Scanner(System.in);
    static int angka1, angka2;
    static char operator;
    static int hasil;

    public static void main(String[] args) {
        boolean ulang = true;

        do {
            System.out.println("====== Kalkulator Sederhana ======");
            System.out.println("1. Hitung");
            System.out.println("2. Selesai");
            int input = 0;
            System.out.print("Pilih aksi : ");
            input = scan.nextInt();

            switch (input) {
                case 1:
                    hitung();
                    System.out.println(hasil + "\n");
                    break;
                case 2:
                    ulang = false;
                    break;
            }
        } while (ulang);
        System.out.println("\nTerima kasih!");

    }

    static void hitung() {
        System.out.print("\nMasukkan Angka 1 : ");
        angka1 = scan.nextInt();
        System.out.print("Masukkan Angka 2 : ");
        angka2 = scan.nextInt();
        System.out.println("\nPilihan Operasi :");
        System.out.println("+ - x /");
        System.out.print("\nPilih salah satu : ");
        operator = scan.next().charAt(0);

        switch (operator){
            case '+':
                tambah(angka1, angka2);
                break;
            case '-':
                kurang(angka1, angka2);
                break;
            case 'x':
                kali(angka1, angka2);
                break;
            case '/':
                bagi(angka1, angka2);
                break;
        }
    }

    static int tambah(int a1, int a2){
        hasil = a1 + a2;
        return hasil;
    }
    static int kurang(int a1, int a2){
        hasil = a1 - a2;
        return hasil;
    }
    static int kali(int a1, int a2){
        hasil = a1 * a2;
        return hasil;
    }

    static int bagi(int a1, int a2){
        hasil = a1 / a2;
        return hasil;
    }

}
