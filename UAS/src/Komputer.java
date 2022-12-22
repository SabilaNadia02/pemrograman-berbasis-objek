public abstract class Komputer implements IMouse, IKeyboard, IPrinter {
    String nama, processor, ram, penyimpanan;

    Komputer(String nama, String processor, String ram, String penyimpanan){
        this.nama=nama;
        this.processor=processor;
        this.ram=ram;
        this.penyimpanan=penyimpanan;
    }

    public void setNama(String nama) {
        this.nama=nama;
    }
    public String getNama() {
        return nama;
    }
    public void setProcessor(String processor) {
        this.processor=processor;
    }
    public String getProcessor() {
        return processor;
    }
    public void setRAM(String ram) {
        this.ram=ram;
    }
    public String getRAM() {
        return ram;
    }
    public void setPenyimpanan(String penyimpanan) {
        this.penyimpanan=penyimpanan;
    }
    public String getPenyimpanan() {
        return penyimpanan;
    }

    abstract void hidupkan_os();
    abstract void matikan_os();
}