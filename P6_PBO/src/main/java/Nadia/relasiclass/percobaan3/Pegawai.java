package Nadia.relasiclass.percobaan3;

/**
 *
 * @author NADIA
 */
public class Pegawai {
    //Atribute
    private String nip;
    private String nama;
    
    //Default Contructor
    Pegawai(String nip, String nama){
        this.nip=nip;
        this.nama=nama;
    }
    
    //Setter and Getter
    public void setNip(String nip){
        this.nip=nip;
    }
    public String getNip(){
        return nip;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(String nama){
        return nama;
    }
    
    //Method
    public String info() { String info = "";
        info += "Nip\t: " + this.nip + "\n";
        info += "Nama\t: " + this.nama + "\n";
        System.out.println();
        return info;
    }
}

