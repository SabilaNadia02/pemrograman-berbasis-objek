public class Program {
    
    public static void main(String[] args) {
        Kucing kucingKampung = new Kucing();
        Ikan lumbaLumba = new Ikan();

        Orang ani = new Orang("Ani");
        Orang budi = new Orang("Budi");

        ani.peliharaanHewan(kucingKampung);
        budi.peliharaanHewan(lumbaLumba);

        ani.ajakPeliharaanJalan();
        budi.ajakPeliharaanJalan();
    }
}


