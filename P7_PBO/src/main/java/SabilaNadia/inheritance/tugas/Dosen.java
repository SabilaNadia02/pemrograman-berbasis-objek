package SabilaNadia.inheritance.tugas;

/**
 *
 * @author NADIA
 */
public class Dosen extends Pegawai{
    public int jumlahSKS;
    public int TARIF_SKS;

    public Dosen(int TARIF_SKS, String nip, String nama, String alamat){
        super(nip,nama,alamat);
        this.TARIF_SKS = TARIF_SKS;
    }
    public void setSKS(){
        jumlahSKS = 20;
    }
    public int getGaji(){
        int gaji = jumlahSKS * TARIF_SKS;
        System.out.println("Jumlah Gaji Dos : " + gaji);
        return gaji;
    }
}



