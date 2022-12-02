package kelas;

public class Triceratops extends Dinosaurus {

    public Triceratops(String jenis) {
        super(jenis);
    }

    @Override
    public void makan() {
        System.out.println("Makanan\t\t : dinosaurus herbivora pemakan tumbuhan.");
        
    }

    @Override
    public void berjalan() {
        System.out.println("Cara Berjalan\t : berat badannya sekitar 6 hingga 8 ton membuatnya tidak dapat berjalan dengan cepat.");
        
    }
    
}
