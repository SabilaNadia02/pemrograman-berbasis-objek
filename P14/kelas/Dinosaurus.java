package kelas;

public abstract class Dinosaurus {
    protected String jenis;

    public Dinosaurus(String jenis) {
        this.jenis=jenis;
    }
    
    public abstract void makan(); 
    public abstract void berjalan();
}