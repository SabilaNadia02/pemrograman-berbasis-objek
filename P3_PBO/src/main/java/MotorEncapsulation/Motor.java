package MotorEncapsulation;

/**
 *
 * @author NADIA
 */
public class Motor {
    private int kecepatan = 0;
    private boolean kontakOn = false;
    
    public void nyalakanMesin()
    {
        kontakOn = true;
    }
    
    public void matikaMesin()
    {
        kontakOn= false;
        kecepatan = 0;
    }
    
    public void tambahKecepatan()
    {
        if(kecepatan != 100)
        {
            if(kontakOn == true)
            {
                kecepatan += 50;
            }
            else
            {
                System.out.println("Kecepatan tidak bisa bertambah karena Mesin Off! \n");
            }
        }
        else 
        {
            System.out.println("Kecepatan mencapai limit! \n");
        }
    }
    
    public void kurangiKecepatan()
    {
        if(kontakOn == true)
            {
               kecepatan -= 5;
            }
            else
            {
                System.out.println("Kecepatan tidak bisa berkurang karena Mesin Off! \n");
            }
    }
    
    public void printStatus()
    {
        if(kontakOn == true)
        {
            System.out.println("Kontak On");
        }
        else
        {
            System.out.println("Kontak Off");
        }
        System.out.println("Kecepatan " + kecepatan + "\n");
    }
}

