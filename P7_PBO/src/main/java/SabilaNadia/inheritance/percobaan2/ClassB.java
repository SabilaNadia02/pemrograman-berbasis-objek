package SabilaNadia.inheritance.percobaan2;

/**
 *
 * @author NADIA
 */
public class ClassB extends ClassA {
    public int z;
    
    public void setZ(int z){
        this.z=z;
    }
    public void getNilaiZ(){
        System.out.println("Nilai z\t : " + z);
    }
    public void getJumlah(){
        System.out.println("Jumlah\t : " + (x+y+z));
    }
}



