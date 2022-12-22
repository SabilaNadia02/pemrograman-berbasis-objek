final class KomputerCetak {

    final static void cetak(Komputer[] obj) {

        for(int i=0; i < obj.length; i++) {
            if(obj[i] instanceof PC) {
                PC pc = (PC) obj[i];
                pc.info();
                pc.hidupkan_os();
                pc.klik_kanan();
                pc.klik_kiri();
                pc.tekan_enter();
                pc.cetak_data();
                pc.matikan_os();
            } else if(obj[i] instanceof Laptop) {
                Laptop laptop = (Laptop) obj[i];
                laptop.info();
                laptop.hidupkan_os();
                laptop.klik_kanan();
                laptop.klik_kiri();
                laptop.tekan_enter();
                laptop.cetak_data();
                laptop.matikan_os();
            } else if(obj[i] instanceof Notebook) {
                Notebook notebook = (Notebook) obj[i];
                notebook.info();
                notebook.hidupkan_os();
                notebook.klik_kanan();
                notebook.klik_kiri();
                notebook.tekan_enter();
                notebook.cetak_data();
                notebook.matikan_os();
            }
        }
    }
    
    public static void main(String[] args) {

        Komputer[] arrKomputer = new Komputer[3];
        Komputer pc = new PC("ROG Strix GA35 G35DX", "AMD Ryzen 9 3950X", "16 GB", "SSD 512 GB, HDD 2 TB", "NVIDIA GeForce RTX 2080 Ti");
        arrKomputer[0] = pc;
        Komputer laptop = new Laptop("Apple MacBook Pro 13-inch", "Intel Core i5", "16 GB", "SSD");
        arrKomputer[1] = laptop;
        Komputer notebook = new Notebook("Acer Aspire 5 Notebook", "Intel Core i3-1115G4", "4 GB", "256 GB SSD", "Inch, Ratio, Panel 14 IPS");
        arrKomputer[2] = notebook;
        
        cetak(arrKomputer);

    }
}