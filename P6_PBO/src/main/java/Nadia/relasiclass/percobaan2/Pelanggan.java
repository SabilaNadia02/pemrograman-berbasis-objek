package Nadia.relasiclass.percobaan2;

/**
 *
 * @author NADIA
 */
public class Pelanggan {
    //Atribute
    private String nama;
    private Mobil mobil;
    private Sopir sopir;
    private int hari;
    
    //Default Constructor
    Pelanggan(){
    
    }
    
    //Setter and Getter
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setMobil(Mobil mobil){
        this.mobil=mobil;
    }
    public Mobil getMobil(){
        return mobil;
    }
    public void setSopir(Sopir sopir){
        this.sopir=sopir;
    }
    public Sopir getSopir(){
        return sopir;
    }
    public void setHari(int hari){
        this.hari=hari;
    }
    public int getHari(){
        return hari;
    }
    
    //Method
    public int hitungBiayaTotal() {
        return mobil.hitungBiayaMobil(hari) + sopir.hitungBiayaSopir(hari);
    }
}

