package P1;

/**
 *
 * @author NADIA
 */
public class Class_Piramida {

    public static void main(String[] args) {
        int[] nim = {2,1,4,1,7,6,2,0,4,6};
        int count=0;
        
        int a=1;
        do{
            int b=4;
            do{
                System.out.print(" ");
                b--;
            }
            while(b>=a);
            
            int c=1;
            do{
                System.out.print(nim[count] + " ");
                count++;
                c++;
            }
            while(c<=a);
            
            a++;
            System.out.println();
        }
        while(a<=4);
    }
}