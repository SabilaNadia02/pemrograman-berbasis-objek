public class Notebook extends Komputer implements IMouse, IKeyboard, IPrinter {
    String layar;
    
    Notebook(String nama, String processor, String ram, String penyimpanan, String layar) {
        super(nama, processor, ram, penyimpanan);
        this.layar=layar;
    }

    void info() {
        System.out.println("=================================================================");
        System.out.println("|                     K O N F I G U R A S I                     |");
        System.out.println("|                           NOTEBOOK                            |");
        System.out.println("=================================================================");
        System.out.println("| Nama\t\t : " + super.nama + "\t\t\t|");
        System.out.println("| Processor\t : " + super.processor + "\t\t\t\t|");
        System.out.println("| RAM\t\t : " + super.ram + "\t\t\t\t\t\t|");
        System.out.println("| Penyimpanan\t : " + super.penyimpanan + "\t\t\t\t\t|");
        System.out.println("| Layar\t\t : " + this.layar + "\t\t\t|");
        System.out.println("|                                                               |");
        System.out.println("| TAHAPAN                                                       |");
    }
    
    @Override
    void hidupkan_os() {
        System.out.println("| Menghidupkan Notebook \t\t\t\t\t|");
        
    }

    @Override
    void matikan_os() {
        System.out.println("| Mematikan Notebook \t\t\t\t\t\t|");
        System.out.println("=================================================================");
    }

    @Override
    public void klik_kanan() {
        System.out.println("| Klik kanan pada Mouse Notebook \t\t\t\t|");
        
    }

    @Override
    public void klik_kiri() {
        System.out.println("| Klik kiri pada Mouse Notebook \t\t\t\t|");
        
    }

    @Override
    public void tekan_enter() {
        System.out.println("| Tekan Enter pada Keyboard Notebook \t\t\t\t|");
        
    }

    @Override
    public void cetak_data() {
        System.out.println("| Cetak data melalui Printer yang terhubung dengan Notebook \t|");
        
    }
}
