package Barang;

/**
 *
 * @author NADIA
 */
public class Barang {
    public String namaBrg;
    public String jenisBrg;
    public int stok;
    
    public void tampilBarang()
    {
        System.out.println("Nama Barang\t: " + namaBrg);
        System.out.println("Jenis Barang\t: " + jenisBrg);
        System.out.println("Stok\t\t: " + stok);
    }
    
    //method dengan argumen dan nilai kembali (return)
    public int tambahStok(int brgMasuk)
    {
        int stokBaru = brgMasuk + stok;
        return stokBaru;
    }
}
