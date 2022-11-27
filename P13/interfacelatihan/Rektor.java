package interfacelatihan;
public class Rektor {

    // public void beriSertifikatCumlaude(Mahasiswa mahasiswa) {
    //     System.out.println("Saya REKTOR, memberikan sertifikat cumlaude.");
    //     System.out.println("Selamat! Silahkan perkenalkan diri Anda..");

    //     mahasiswa.kuliahDiKampus();
    //     mahasiswa.lulus();
    //     mahasiswa.meraihIPKTinggi();

    //     System.out.println("============================================");
    
    // }
    public void beriSertifikatMawapres(Sarjana sarjanaCum) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");

        sarjanaCum.menjuaraiKompetisi();
        sarjanaCum.membuatPublikasiIlmiah();

        System.out.println("============================================");
    
    }

    public void beriSertifikatCumlaude(PascaSarjana masterCum) {
        System.out.println("Saya REKTOR, memberikan sertifikat MAWAPRES.");
        System.out.println("Selamat! Bagaimana Anda bisa berprestasi?");
        
        masterCum.menjuaraiKompetisi();
        masterCum.membuatPublikasiIlmiah();

        System.out.println("============================================");
    }

}

