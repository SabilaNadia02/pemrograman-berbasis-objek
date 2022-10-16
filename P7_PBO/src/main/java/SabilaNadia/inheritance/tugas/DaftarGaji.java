package SabilaNadia.inheritance.tugas;

/**
 *
 * @author NADIA
 */
public class DaftarGaji {
    public Pegawai listPegawai[];
    public int jumlahPegawai;
    
    DaftarGaji(int jumlah){
        listPegawai = new Pegawai[jumlah];
    }
    public void addPegawai(Pegawai peg){
        listPegawai[jumlahPegawai] = peg;
        jumlahPegawai++;
    }

    public void printSemuaGaji(){
        for(int i = 0;i < jumlahPegawai; i++){
                System.out.println("Nama\t\t : " + listPegawai[i].getNama());
                System.out.println("NIP\t\t : " + listPegawai[i].nip);
                System.out.println("Alamat\t\t : " + listPegawai[i].alamat);
                System.out.println("Total Gaji\t : " + listPegawai[i].getGaji()
                        + "\n");
        }
    }
}



