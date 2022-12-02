package kelas;

public class AnakPemburu extends Pemburu implements IMengambilTelur {

    @Override
    public void mengambilTelur(Dinosaurus dino) {
        dino.makan();
        dino.berjalan();
        System.out.println("Anak pemburu mengambil telur Dinosaurus Oviraptor.");
        
    }
    
}
