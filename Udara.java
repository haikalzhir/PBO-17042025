
package praktikum17042025;


public class Udara extends Kendaraan{
    private Boolean mesin;
    
    public Udara (){
    }
    
    public Udara (String nama, int tahunProduksi,boolean mesin){
        super (nama,tahunProduksi);
        this.mesin=mesin;
    }
    public boolean getMesin(){
        return mesin;
    }
    public void setMesin (boolean mesin){
        this.mesin=mesin;
    }
    
    @Override
    public void Cetak (){
        super.Cetak();
        System.out.println("Menggunakan mesin = "+(mesin? "YA" : "TIDAK "));
    }
    
}
