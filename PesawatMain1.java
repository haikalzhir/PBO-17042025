
package praktikum17042025;


public class PesawatMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pesawat p=new Pesawat("Air asia",2020,true,130);
        System.out.println("Kondisi awal");
        p.Cetak();
        
        System.out.println();
        
        System.out.println("Kondisi setelah reset");
        p.reset("Lion Air", 1998, true, 80);
        p.Cetak();
    }
    
}
