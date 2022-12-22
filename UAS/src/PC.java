public class PC extends Komputer implements IMouse, IKeyboard, IPrinter {
    String kartuGrafik;
    
    PC(String nama, String processor, String ram, String penyimpanan, String kartuGrafik) {
        super(nama, processor, ram, penyimpanan);
        this.kartuGrafik=kartuGrafik;
    }

    void info() {
        System.out.println("=================================================================");
        System.out.println("|                     K O N F I G U R A S I                     |");
        System.out.println("|                              PC                               |");
        System.out.println("=================================================================");
        System.out.println("| Nama\t\t : " + super.nama + "\t\t\t\t|");
        System.out.println("| Processor\t : " + super.processor + "\t\t\t\t|");
        System.out.println("| RAM\t\t : " + super.ram + "\t\t\t\t\t|");
        System.out.println("| Penyimpanan\t : " + super.penyimpanan + "\t\t\t\t|");
        System.out.println("| Kartu Grafik\t : " + this.kartuGrafik + "\t\t\t|");
        System.out.println("|                                                               |");
        System.out.println("| TAHAPAN                                                       |");
    }
    
    @Override
    void hidupkan_os() {
        System.out.println("| Menghidupkan PC \t\t\t\t\t\t|");
        
    }

    @Override
    void matikan_os() {
        System.out.println("| Mematikan PC \t\t\t\t\t\t\t|");
        System.out.println("=================================================================");
    }

    @Override
    public void klik_kanan() {
        System.out.println("| Klik kanan pada Mouse PC \t\t\t\t\t|");
        
    }

    @Override
    public void klik_kiri() {
        System.out.println("| Klik kiri pada Mouse PC \t\t\t\t\t|");
        
    }

    @Override
    public void tekan_enter() {
        System.out.println("| Tekan Enter pada Keyboard PC \t\t\t\t\t|");
        
    }

    @Override
    public void cetak_data() {
        System.out.println("| Cetak data melalui Printer yang terhubung dengan PC \t\t|");

    }

}
