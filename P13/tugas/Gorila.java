package tugas;

public class Gorila extends Binatang implements IKarnivora, IHerbivora {
    String suara;
    String warnaBulu;

    public Gorila(String nama, int jmlKaki, String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara=suara;
        this.warnaBulu=warnaBulu;
    }

    @Override
    public void displayMakan() {
        System.out.println("Makanan\t\t : Daging + Tumbuhan");
        
    }

    @Override
    public void displayBinatang() {
        System.out.println("Jenis\t\t : Omnivora");
        
    }

    public void displayData() {
        this.displayBinatang();
        this.displayMakan();
        System.out.println("Nama\t\t : " + super.nama);
        System.out.println("Jumlah Kaki\t : " + super.jmlKaki);
        System.out.println("Suara\t\t : " + this.suara);
        System.out.println("Warna Bulu\t : " + this.warnaBulu);
    }
    
}

