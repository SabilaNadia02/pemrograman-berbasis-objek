package Nadia.relasiclass.percobaan2;

/**
 *
 * @author NADIA
 */
public class Mobil {
    //Atribute
    private String merk;
    private int biaya;
    
    //Default Constructor
    Mobil(){
    
    }
    
    //Setter and Getter
    public void setMerk(String merk){
        this.merk=merk;
    }
    public String getMerk(){
        return merk;
    }
    public void setBiaya(int biaya){
        this.biaya=biaya;
    }
    public int getBiaya(){
        return biaya;
    }
    
    //Method
    public int hitungBiayaMobil(int hari) {
        return biaya * hari;
    }
}

