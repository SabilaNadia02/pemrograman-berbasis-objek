package Tugas;
import java.util.Scanner;

public class TestKoperasi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== SISTEM KOPERASI ===");
        Anggota donny = new Anggota("111333444", "Donny", 5000000);
        System.out.println("Nama Anggota: " + donny.getNama());
        System.out.println("Limit Pinjaman: " + donny.getLimitPinjaman());
        System.out.println("------------------------");
        
        System.out.println("Masukakan nominal pinjaman : ");
        int n = sc.nextInt();
        donny.pinjam(n);
        System.out.println("Meminjam uang " + n + "...");
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
        
        System.out.println();
        
        System.out.println("Masukakan nominal angsuran : ");
        int s = sc.nextInt();
        donny.angsur(s);
        System.out.println("Membayar angsuran " + s + "...");
        System.out.println("Jumlah pinjaman saat ini: " + donny.getJumlahPinjaman());
    }
}

