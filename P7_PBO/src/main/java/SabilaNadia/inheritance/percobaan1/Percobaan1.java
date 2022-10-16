package SabilaNadia.inheritance.percobaan1;

/**
 *
 * @author NADIA
 */
public class Percobaan1 {

    public static void main(String[] args) {
        
        ClassA a = new ClassA();
        a.setX(20);
        a.setY(30);
        
        ClassB hitung = new ClassB();
        hitung.z=5;
        hitung.x=20;
        hitung.y=30;
        hitung.getNilai();
        hitung.getNilaiZ();
        hitung.getJumlah();
    }
}


