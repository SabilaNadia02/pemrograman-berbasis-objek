import interfacelatihan.PascaSarjana;
import interfacelatihan.Rektor;
import interfacelatihan.Sarjana;

public class interfacemain {
    
    public static void main(String[] args) {
        //Rektor pakrektor = new Rektor();

        // Mahasiswa mhsBiasa = new Mahasiswa("Charlie");
        // Sarjana sarjanaCumlaude = new Sarjana("Dini");
        // PascaSarjana masterCumlaude = new PascaSarjana("Elok");

        // pakrektor.beriSertifikatCumlaude(mhsBiasa);
        // pakrektor.beriSertifikatCumlaude(sarjanaCumlaude);
        // pakrektor.beriSertifikatCumlaude(masterCumlaude);

        Rektor pakRektor = new Rektor();

        Sarjana sarjanaCum = new Sarjana("Dini");
        PascaSarjana masterCum = new PascaSarjana("Elok");

        pakRektor.beriSertifikatMawapres(sarjanaCum);
        pakRektor.beriSertifikatCumlaude(masterCum);
    }
}


