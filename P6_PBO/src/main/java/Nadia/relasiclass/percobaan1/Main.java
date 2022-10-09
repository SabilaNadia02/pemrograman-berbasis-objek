package Nadia.relasiclass.percobaan1;

/**
 *
 * @author NADIA
 */
public class Main {

    public static void main(String[] args) {
        //Processor P = new Processor("Intel i5", 3);
        Laptop L = new Laptop("Thinkpad", new Processor("Intel i5", 3)); 
        //Laptop L = new Laptop("Thinkpad", P);
        L.info();
        
        System.out.println();
        
        Processor P1 = new Processor();
        P1.setMerk("Intel i5");
        P1.setCache(4);
        Laptop L1 = new Laptop();
        L1.setMerk("Thinkpad");
        L1.setProc(P1);
        L1.info();
    }
}