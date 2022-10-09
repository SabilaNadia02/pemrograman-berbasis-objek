package Nadia.relasiclass.percobaan4;

/**
 *
 * @author NADIA
 */
public class Main {

    public static void main(String[] args) {
        Gerbong gerbong = new Gerbong("A", 10);
        
        Penumpang p = new Penumpang("12345", "Mr. Krab");
        gerbong.setPenumpang(p, 1);
        Penumpang budi = new Penumpang("6789", "Budi");
        gerbong.setPenumpang(budi, 1);
        Penumpang rani = new Penumpang("10112", "Rani");
        gerbong.setPenumpang(rani, 2);
        System.out.println(gerbong.info());
    }    
}


