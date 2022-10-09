package Nadia.relasiclass.percobaan1;

/**
 *
 * @author NADIA
 */
public class Laptop {
    private String merk;
    private Processor proc;
    
    //Membuat constructor default 
    Laptop(){
    
    }
    
    //Membuat constructor berparameter
    Laptop(String merk, Processor proc){
        this.merk=merk;
        this.proc=proc;
    }
    
    //Implementasi setter dan getter
    public String getMerk(){
        return merk;
    }
    public void setMerk(String merk){
        this.merk=merk;
    }
    public Processor getProc(){
        return proc;
    }
    public void setProc(Processor proc){
        this.proc=proc;
    }
    
    //Membuat Method
    public void info() {
        System.out.println("Merk Laptop \t\t= " + merk);
        proc.info();
    }
}

