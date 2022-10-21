package SabilaNadia.inheritance.tugas1;

/**
 *
 * @author NADIA
 */
public class Komputer {
    public String merk;
    public int kecProsesor;
    public int sizeMemory;
    public String jnsProsesor;
    
    public Komputer(){
        
    }
    public Komputer(String merk, int kecProsesor, int sizeMemory, 
            String jnsProsesor){
        this.merk=merk;
        this.kecProsesor=kecProsesor;
        this.sizeMemory=sizeMemory;
        this.jnsProsesor=jnsProsesor;
    }
    public void tampilData(){
        System.out.println("Merk\t\t\t : " + merk);
        System.out.println("Kecepatan Prosesor\t : " + kecProsesor + " MHz");
        System.out.println("Size Memory\t\t : " + sizeMemory + " GB RAM");
        System.out.println("Jenis Prosesor\t\t : " + jnsProsesor);
    }
}



