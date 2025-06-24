
package praktikum17042025;


public class Kucing extends Hewan{
    
    public Kucing(String nama){
        super (nama);
    }
    
    public void bersuara(){
        super.bersuara();
        System.out.println(nama+"berkata Meong!!!");
    }
    
}
