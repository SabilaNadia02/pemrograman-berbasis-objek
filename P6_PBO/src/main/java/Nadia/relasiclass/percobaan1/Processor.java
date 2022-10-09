package Nadia.relasiclass.percobaan1;

/**
 *
 * @author NADIA
 */
public class Processor {
    private String merk;
    private double cache;
    
    //Membuat constructor default 
    Processor(){
    
    }
    
    //Membuat constructor berparameter
    Processor(String merk, double cache){
        this.merk=merk;
        this.cache=cache;
    }
    
    //Implementasi setter dan getter
    public String getMerk(){
        return merk;
    }
    public void setMerk(String merk){
        this.merk=merk;
    }
    public double getCache(){
        return cache;
    }
    public void setCache(double cache){
        this.cache=cache;
    }
    
    //Membuat Method
    public void info() {
    System.out.printf("Merk Processor \t= %s\n", merk);
    System.out.printf("Cache Memory \t\t= %.2f\n", cache);
    }
}
