package kelas;

public class TyrannosaurusRex extends Dinosaurus {

    public TyrannosaurusRex(String jenis) {
        super(jenis);
    }

    @Override
    public void makan() {
        System.out.println("Makanan\t\t : seekor predator yang juga memakan bangkai");
        
    }

    @Override
    public void berjalan() {
        System.out.println("Cara Berjalan\t : gaya berjalan lebih realistis dan sedikit lebih lambat");
        
    }
    
}
