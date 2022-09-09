package P1;
import java.io.FileNotFoundException;
import java.util.Formatter;

/**
 *
 * @author NADIA
 */
public class Class_Piramida {
    
    public static void main(String[] args){
            
         try (Formatter file = new Formatter("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\P1_PBO\\src\\main\\java\\P1\\Output.txt")) {
            
            int[] nim = {2,1,4,1,7,6,2,0,4,6};
            int count=0;

            int a=1;
            do{
                int b=4;
                do{
                    System.out.print(" ");
                    file.format("%s", " ");
                    b--;
                }
                while(b>=a);

                int c=1;
                do{
                    System.out.print(nim[count] + " ");
                    file.format("%s", nim[count] + " ");
                    count++;
                    c++;
                }
                while(c<=a);

                a++;
                System.out.println();
                file.format("%s %n", " ");
            }
            while(a<=4);
            
        }catch(FileNotFoundException ex){
            //Menampilkan pesan jika file tidak ditemukan
            System.out.println("File Tidak Ditemukan"); 
        }
    }
}