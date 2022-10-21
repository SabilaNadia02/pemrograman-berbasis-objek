package SabilaNadia.inheritance.tugas1;

/**
 *
 * @author NADIA
 */
public class Windows extends Laptop{
    public String fitur;
    
    public Windows(){
        
    }
    public Windows(String merk, int kecProsesor, int sizeMemory, 
            String jnsProsesor, String jnsBaterai, String fitur){
        this.merk=merk;
        this.kecProsesor=kecProsesor;
        this.sizeMemory=sizeMemory;
        this.jnsProsesor=jnsProsesor;
        this.jnsBaterai=jnsBaterai;
        this.fitur=fitur;
    }
    public void tampilWindows(){
        System.out.println("========== Detail Windows ==========");
        super.tampilLaptop();
        System.out.println("Fitur\t\t\t : " + fitur);
    }
}



