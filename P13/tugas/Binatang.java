package tugas;

public abstract class Binatang {
    String nama;
    int jmlKaki;

    Binatang(String nama, int jmlKaki) {
        this.nama=nama;
        this.jmlKaki=jmlKaki;
    }
    public void setNama(String nama) {
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    public void setKaki(int jmlKaki) {
        this.jmlKaki=jmlKaki;
    }
    public int jmlKaki() {
        return jmlKaki;
    }
    public abstract void displayBinatang();
}

