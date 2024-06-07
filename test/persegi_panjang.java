import java.util.Scanner;

public class persegi_panjang {
    public static void main(String[] args) {
        // inisiasi sebuah variable yg dibutuhkan sebuah program
        int panjang, lebar, tinggi, volume;
        Scanner x = new Scanner(System.in);
        System.out.println("Masukan Panjang Balok"); // melakukan proses input panjang balok
        panjang = x.nextInt();
        System.out.print("Masukan Lebar Balok"); // melakukan proses intput lebar balok
        lebar = x.nextInt();
        System.out.print("Masukan Tinggi Balok"); // melakukan proses intput Tinggi balok
        tinggi = x.nextInt();
        volume = panjang * lebar * tinggi;
        System.out.println("volume Balok=" + volume); // melakukan proses input volume balok

    }
}