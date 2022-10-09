package Nadia.relasiclass.percobaan3;

/**
 *
 * @author NADIA
 */
public class KeretaApi {
    //Atributes
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;
    
    //Konstruktor 3 Parameter
    KeretaApi(String nama, String kelas, Pegawai masinis){
        this.nama=nama;
        this.kelas=kelas;
        this.masinis=masinis;
    }
    //Konstruktor 4 Parameter
    KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten){
        this.nama=nama;
        this.kelas=kelas;
        this.masinis=masinis;
        this.asisten=asisten;
    }
    
    //Setter and Getter
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setKelas(String kelas){
        this.kelas=kelas;
    }
    public String getKelas(){
        return kelas;
    }
    public void setMasinis(Pegawai masinis){
        this.masinis=masinis;
    }
    public Pegawai getMasinis(){
        return masinis;
    }
    public void setAsisten(Pegawai asisten){
        this.asisten=asisten;
    }
    public Pegawai getAsisten(){
        return asisten;
    }
    
    //Method
    public String info() {
        String info = "";
        info += "Nama\t: " + this.nama + "\n";
        info += "Kelas\t: " + this.kelas + "\n";
        System.out.println();
        info += "\nMasinis\n" + this.masinis.info() + "\n";
        info += "Asisten\n" + this.asisten.info() + "\n";
        return info;
    }
}

