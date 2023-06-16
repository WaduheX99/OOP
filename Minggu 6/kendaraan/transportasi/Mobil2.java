package transportasi;

public class Mobil2{
    private int roda = 4;
    private int body = 1;
    static int mesin = 1;
    public void maju(){
        System.out.println("Maju .....");
    }
    public void mundur(){
        System.out.println("Mundur .....");
    }
    public void belok(){
        System.out.println("Belok.....");
    }
    public void hidup(String nama){
        System.out.println("Hidupkan Mobil : "+nama);
    }
    public void mati(String nama){
        System.out.println("Matikan Mobil : "+nama);
    }
    public void ubahGigi(String nama){
        System.out.println("Ubah Gigi Mobil : "+nama);
    }
    public void setRoda(int roda){
        this.roda = roda;
    }
    public int getRoda(){
        return roda;
    }
    public void setMesin(int mesin){
        this.mesin = mesin;
    }
    public int getMesin(){
        return mesin;
    }
}