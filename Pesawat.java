
package praktikum17042025;

public class Pesawat extends Udara{
    private int muatan;
    
    public Pesawat (){
    }
    public Pesawat (String nama, int tahunProduksi,boolean mesin, int muatan){
        super (nama,tahunProduksi,mesin);
        this.muatan=muatan;
    }
    public int getMuatan(){
        return muatan;
    }
    public void setMuatan (int muatan){
        this.muatan=muatan;
    }
    public void reset (String nama,int tahunProduksi,boolean mesin,int muatan){
        setNama(nama);
        setTahunProduksi(tahunProduksi);
        setMesin(mesin);
        setMuatan(muatan);
    }
    public String kategori (int muatan){
        if (muatan <=50)
            return "Bobot kecil";
        else if (muatan<=100)
            return "Bobot menengah";
        else
            return "Bobot berat";
    }
    @Override
    public void Cetak(){
        super.Cetak();
        System.out.println("Muatan pesawat " +muatan+"orang penumpang");
        System.out.println("Kategori = "+kategori (muatan));
    }
    
}
