package SabilaNadia.inheritance.percobaan1;

/**
 *
 * @author NADIA
 */
public class Inheritance1 {

    public static void main(String[] args) {
        
        Manager M = new Manager();
        M.nama="Vivin";
        M.alamat="Jl. Vinolia";
        M.umur=25;
        M.jk="Perempuan";
        M.gaji=3000000;
        M.tunjangan=1000000;
        M.tampilDataManager();
        System.out.println();
        Staff S = new Staff();
        S.nama="Lestari";
        S.alamat="Malang";
        S.umur=25;
        S.jk="Perempuan";
        S.gaji=2000000;
        S.lembur=500000;
        S.potongan=250000;
        S.tampilDataStaff();
        System.out.println();
        StaffTetap ST = new StaffTetap("Budi","Malang","Laki Laki",20,2000000,
                250000,200000,"2A",100000);
        ST.tampilStaffTetap();
        System.out.println();
        StaffHarian SH = new StaffHarian("Indah","Malang","Perempuan",27,10000,
                100000,50000,100);
        SH.tampilStaffHarian();
    }
}


