package Nadia.relasiclass.percobaan4;

/**
 *
 * @author NADIA
 */
public class Kursi {
    //Atributes
    private String nomor;
    private Penumpang penumpang;
    
    //Konstruktor berparameter
    Kursi(String nomor){
        this.nomor=nomor;   
    }
    
    //Setter and Getter
    public void setNomor(String nomor){
        this.nomor=nomor;
    }
    public String getNomor(){
        return nomor;
    }
    public void setPenumpang(Penumpang penumpang){
        this.penumpang=penumpang;
    }
    public Penumpang getPenumpang(){
        return penumpang;
    }
    
    //Method
    public String info() {
        String info = "";
        info += "Nomor: " + nomor + "\n";
        if (this.penumpang != null) {
        info += "Penumpang: " + penumpang.info() + "\n";
        }
        return info;
    }
}


