package P1;

/**
 *
 * @author NADIA
 */
public class Class_Jumlah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] nim = {2,1,4,1,7,6,2,0,4,6};
        
        //Menggunakan perulangan DO-WHILE
        int k=0;
        int sum=0;
        do{
            sum += nim[k];
            k++;
        }
        while(k < nim.length);
        System.out.println("Penjumlahan NIM = " + sum);
        
        System.out.println(" ");
        
        //Menggunakan perulangan FOR
        for(int k=0; k < nim.length; k++){
            sum += nim[k];
        }
        System.out.println("Penjumlahan NIM = " + sum);
    }
}
