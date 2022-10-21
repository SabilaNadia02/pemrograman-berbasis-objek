package SabilaNadia.inheritance.tugas1;

/**
 *
 * @author NADIA
 */
public class MainProgram {

    public static void main(String[] args) {
        Komputer komputer = new Komputer();
        Laptop laptop = new Laptop();
        Mac mac = new Mac();
        Windows windows = new Windows();
        Pc pc = new Pc();
        
        //Komputer
        System.out.println("========== Detail Komputer ==========");
        komputer.merk="APPLE";
        komputer.kecProsesor=84;
        komputer.sizeMemory=2933;
        komputer.jnsProsesor="Intel";
        komputer.tampilData();
        
        System.out.println();
        
        //Laptop
        System.out.println("========== Detail Laptop ==========");
        laptop.merk="ACER";
        laptop.kecProsesor=500;
        laptop.sizeMemory=16;
        laptop.jnsProsesor="Intel";
        laptop.jnsBaterai="Nickel Cadmium";
        laptop.tampilLaptop();
        
        System.out.println();
        
        //Mac
        mac.merk="MackBook";
        mac.kecProsesor=84;
        mac.sizeMemory=32;
        mac.jnsProsesor="Intel";
        mac.jnsBaterai="Nickel Cadmium";
        mac.security="Malware Mac";
        mac.tampilMac();
        
        System.out.println();
        
        //Windows
        windows.merk="ASUS VivoBook";
        windows.kecProsesor=850;
        windows.sizeMemory=16;
        windows.jnsProsesor="Intel";
        windows.jnsBaterai="Nickel Cadmium";
        windows.fitur="Microsoft 2021";
        windows.tampilWindows();
        
        System.out.println();
        
        //PC
        pc.merk="Asus";
        pc.kecProsesor=850;
        pc.sizeMemory=2933;
        pc.jnsProsesor="Intel";
        pc.ukuranMonitor=43;
        pc.tampilPc();
    }
}



