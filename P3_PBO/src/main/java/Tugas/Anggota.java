package Tugas;

/**
 *
 * @author NADIA
 */
public class Anggota {
    private String noKTP;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;
    
    Anggota(String noKTP, String nama, int limitPeminjaman){
        this.noKTP=noKTP;
        this.nama=nama;
        this.limitPeminjaman=limitPeminjaman;
        this.jumlahPinjaman=0;
    }
    
    public String getKTP() {
        return noKTP;
    }
    public void setKTP(String noKTP){
        this.noKTP = noKTP;
    }
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public int getLimitPinjaman(){
        return limitPeminjaman;
    }
    public int getJumlahPinjaman(){
        return jumlahPinjaman;
    }
    
    public void pinjam(int uang){
        if(uang < limitPeminjaman){
            jumlahPinjaman += uang;
        } else {
            System.out.println("Maaf, jumlah pinjaman melebihi limit.\n");
        }
    }
    public void angsur(int uang){
        if(uang > (jumlahPinjaman * 0.1)){
            jumlahPinjaman -= uang;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman.\n");
        }
    }
}

