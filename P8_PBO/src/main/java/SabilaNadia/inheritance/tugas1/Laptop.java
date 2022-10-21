package SabilaNadia.inheritance.tugas1;

/**
 *
 * @author NADIA
 */
public class Laptop extends Komputer{
    public String jnsBaterai;
    
    public Laptop(){
        
    }
    public Laptop(String merk, int kecProsesor, int sizeMemory, 
            String jnsProsesor, String jnsBaterai){
        this.merk=merk;
        this.kecProsesor=kecProsesor;
        this.sizeMemory=sizeMemory;
        this.jnsProsesor=jnsProsesor;
        this.jnsBaterai=jnsBaterai;
    }
    public void tampilLaptop(){
        super.tampilData();
        System.out.println("Jenis Baterai\t\t : " + jnsBaterai);
    }
}


