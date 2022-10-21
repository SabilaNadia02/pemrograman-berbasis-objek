package SabilaNadia.inheritance.tugas1;

/**
 *
 * @author NADIA
 */
public class Mac extends Laptop{
    public String security;
    
    public Mac(){
        
    }
    public Mac(String merk, int kecProsesor, int sizeMemory, 
            String jnsProsesor, String jnsBaterai, String security){
        this.merk=merk;
        this.kecProsesor=kecProsesor;
        this.sizeMemory=sizeMemory;
        this.jnsProsesor=jnsProsesor;
        this.jnsBaterai=jnsBaterai;
        this.security=security;
    }
    public void tampilMac(){
        System.out.println("========== Detail Mac ==========");
        super.tampilLaptop();
        System.out.println("Security\t\t\t : " + security);
    }
}



