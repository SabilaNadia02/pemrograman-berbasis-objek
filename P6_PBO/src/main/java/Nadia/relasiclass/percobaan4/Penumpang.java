package Nadia.relasiclass.percobaan4;

/**
 *
 * @author NADIA
 */
public class Penumpang {
    private String ktp;
    private String nama;
    
    Penumpang(String ktp, String nama){
        this.ktp=ktp;
        this.nama=nama;
    }
    
    //Setter and Getter
    public void setKtp(String ktp){
        this.ktp=ktp;
    }
    public String getKtp(){
        return ktp;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    
    //Method
    public String info() {
        String info = "";
        info += "Ktp: " + ktp + "\n";
        info += "Nama: " + nama + "\n";
        return info;
    }
}


