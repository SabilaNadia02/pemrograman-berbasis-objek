import tugas.Gorila;
import tugas.Keledai;
import tugas.Singa;

public class MainProgram {
    
    public static void main(String[] args) {
        Singa singa = new Singa("Singa", 4, "roarr roarr", "coklat");
        singa.displayData();

        System.out.println();

        Keledai keledai = new Keledai("keledai", 4, "hehehehehehe","abu-abu");
        keledai.displayData();

        System.out.println();

        tugas.Gorila gorila = new Gorila("Gorila", 4, "hauummm haummm", "hitam manis");
        gorila.displayData();
    }
}

