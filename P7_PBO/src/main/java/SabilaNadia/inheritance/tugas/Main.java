package SabilaNadia.inheritance.tugas;

/**
 *
 * @author NADIA
 */
public class Main {

    public static void main(String[] args) {
        
        //Instansiasi dan Memberikan Value Dosen
        Dosen dos = new Dosen(50000, "2141762046", "Sabila Nadia", "Kediri");
        dos.setSKS();
        
        //Instansiasi dan Memberikan Value Pegawai
        Pegawai peg = new Pegawai("2131710046", "Nadia Sabila", "Malang");
        
        //Instansiasi dan Memberikan Value pada Daftar Gaji
        DaftarGaji daftar = new DaftarGaji(10);
        daftar.addPegawai(peg);
        daftar.addPegawai(dos);
        daftar.printSemuaGaji();
    }
}


