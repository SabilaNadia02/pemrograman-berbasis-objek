package Tugas;

/**
 *
 * @author NADIA
 */
public class EncapTest {

    public static void main(String[] args) {
        EncapDemo encap = new EncapDemo();
        encap.setName("James");
        encap.setAge(35);
        
        System.out.println("Name\t : " + encap.getName());
        System.out.println("Age\t : " + encap.getAge());
    }
}