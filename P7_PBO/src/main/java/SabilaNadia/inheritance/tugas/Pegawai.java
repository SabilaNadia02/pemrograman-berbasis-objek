package SabilaNadia.inheritance.tugas;

/**
 *
 * @author NADIA
 */
public class Pegawai {
    public String nip;
    public String nama;
    public String alamat;
    int gaji=5000000;
    
    protected Pegawai(String nip, String nama, String alamat){
        this.nip=nip;
        this.nama=nama;
        this.alamat=alamat;
    }
    protected String getNama(){
        return nama;
    }
    protected int getGaji(){
        return gaji;
    }
}


 
