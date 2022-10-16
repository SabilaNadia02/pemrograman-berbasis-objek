package SabilaNadia.inheritance.percobaan1;

/**
 *
 * @author NADIA
 */
public class ClassA {
    public int x;
    public int y;
    
    ClassA(){
        
    }
    ClassA(int x, int y){
        this.x=x;
        this.y=y;
    }
    
    public void setX(int x){
        this.x=x;
    }
    
    public void setY(int y){
        this.y=y;
    }
    
    
    public void getNilai(){
        System.out.println("Nilai x\t : " + x);
        System.out.println("Nilai y\t : " + y);
    }
}


