package Nadia.relasiclass.percobaan2;

/**
 *
 * @author NADIA
 */
public class Sopir {
    //Atribute
    private String nama;
    private int biaya;
    
    //Default Constructor
    Sopir(){
    
    }
    
    //Setter and Getter
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setBiaya(int biaya){
        this.biaya=biaya;
    }
    public int getBiaya(){
        return biaya;
    }
    
    //Method
    public int hitungBiayaSopir(int hari) {
        return biaya * hari;
    }

}
