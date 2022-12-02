import kelas.AnakPemburu;
import kelas.Oviraptor;
import kelas.Pemburu;
import kelas.Triceratops;
import kelas.TyrannosaurusRex;

public class Main {
    public static void main(String[] args) {
        TyrannosaurusRex tirex = new TyrannosaurusRex("TyrannosaurusRex");
        Triceratops triceratops = new Triceratops("Triceratops");
        Oviraptor oviraptor = new Oviraptor("Oviraptor");
        Pemburu pemburu = new Pemburu();
        AnakPemburu anakPemburu = new AnakPemburu();

        System.out.println("DINOSAURUS TRICERATOPS");
        triceratops.makan();
        triceratops.berjalan();
        System.out.println();

        System.out.println("DINOSAURUS TYRANNOSAURUS T-REX");
        pemburu.berburu(tirex);
        System.out.println();

        System.out.println("DINOSAURUS OVIRAPTOR");
        oviraptor.bertelur();
        anakPemburu.mengambilTelur(oviraptor);
        System.out.println();
        
    }

}
