package SabilaNadia.inheritance.tugas1;

/**
 *
 * @author NADIA
 */
public class Pc extends Komputer{
    public int ukuranMonitor;
    
    public Pc(){
        
    }
    public Pc(String merk, int kecProsesor, int sizeMemory, 
            String jnsProsesor, int ukuranMonitor){
        this.merk=merk;
        this.kecProsesor=kecProsesor;
        this.sizeMemory=sizeMemory;
        this.jnsProsesor=jnsProsesor;
        this.ukuranMonitor=ukuranMonitor;
    }
    public void tampilPc(){
        System.out.println("========== Detail PC ==========");
        super.tampilData();
        System.out.println("Ukuran Monitor\t\t : " + ukuranMonitor + " inch");
    }
}



