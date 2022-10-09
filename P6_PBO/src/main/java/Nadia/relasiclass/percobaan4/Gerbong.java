package Nadia.relasiclass.percobaan4;
import java.util.*;
/**
 *
 * @author NADIA
 */
public class Gerbong {
    //Atributes
    private String kode;
    private int jumlah;
    private Penumpang penumpang;
    private Kursi nomor;
    private Kursi arrayKursi[];
    
    //Konstruktor berparameter
    public Gerbong(String kode, int jumlah) {
        this.kode = kode;
        this.arrayKursi = new Kursi[jumlah];
        this.initKursi();
    }
    
    //Setter and Getter
    public void setKode(String kode){
        this.kode=kode;
    }
    public String getKode(){
        return kode;
    }
    public void setPenumpang(Penumpang penumpang, Kursi nomor){
        this.penumpang=penumpang;
        this.nomor=nomor;
    }
    public Kursi[] getArrayKursi(){
        return arrayKursi;
    }
    
    //Method
    private void initKursi() {
        for (int i = 0; i < arrayKursi.length; i++) {
        this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
        }
    }
    public String info() {
        String info = "";
        info += "Kode: " + kode + "\n";
        for (Kursi kursi : arrayKursi) {
        info += kursi.info();
        }
        return info;
    }
    public void setPenumpang(Penumpang penumpang, int nomor) {
        if(this.arrayKursi[nomor - 1].getPenumpang() == null){
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);        
        }else{
            nomor++;
            this.arrayKursi[nomor - 1].setPenumpang(penumpang);      
        }
    }
}


