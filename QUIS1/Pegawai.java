public class Pegawai {
    private String nama;
    private String NIP;
    private double gajiPokok = 2000;
    private double uangMakan = 3500;
    private double transport = 4000;
    private double lembur;
    private int jumlahJamKerja;

    Pegawai(String nama, String NIP, int jumlahJamKerja){
        this.nama=nama;
        this.NIP=NIP;
        this.jumlahJamKerja=0;
    }

    //Membuat Getter dan Setter untuk setJamKerja
    public int getJamKerja(){
        return jumlahJamKerja;
    }
    public void setJamKerja(int jumlahJamKerja){
        this.jumlahJamKerja=jumlahJamKerja;
    }

    //Membuat business process perhitungan gaji
    public void hitungGajiHarian(){
        double total = jumlahJamKerja * gajiPokok;
    }

    //Mencetak penghasilan
    public void cetakPenghasilan(){
        System.out.println("### SISTEM PENGGAJIAN ###");
        System.out.println("NIP\t : " + NIP);
        System.out.println("Nama\t : " + nama);
        System.out.println("Gaji Pokok\t : " + gajiPokok);
        System.out.println("Lembur\t : " + hari + " (Rp" + lembur + ")");
        System.out.println("Uang Makan\t : " + uangMakan);
        System.out.println("Transport Lembur\t : " + transport);
        System.out.println("Total Gaji\t : " + total);
    }
}