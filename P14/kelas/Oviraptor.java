package kelas;

public class Oviraptor extends Dinosaurus implements IBertelur {
    
    public Oviraptor(String jenis) {
        super(jenis);
    }

    @Override
    public void makan() {
        System.out.println("Makanan\t\t : memangsa berbagai macam jenis binatang invertebrata seperti jenis crustacea dan molusca.");
    
    }

    @Override
    public void berjalan() {
        System.out.println("Cara Berjalan\t : berjalan dengan dua kaki belakang yang panjang dan berkembang dengan baik.");
    
    }

    @Override
    public void bertelur() {
        System.out.println(super.jenis + " dapat bertelur.");
        
    }   
}
