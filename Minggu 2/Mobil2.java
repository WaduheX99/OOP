public class Mobil2{
    private int roda = 4;
    private int body = 1;
    static int mesin = 1;
    static void maju(){
        System.out.println("Maju .....");
    }
    void mundur(){
        System.out.println("Mundur .....");
    }
    void belok(){
        System.out.println("Belok.....");
    }
    void hidup(String nama){
        System.out.println("Hidupkan Mobil : "+nama);
    }
    void mati(String nama){
        System.out.println("Matikan Mobil : "+nama);
    }
    void ubahGigi(String nama){
        System.out.println("Ubah Gigi Mobil : "+nama);
    }
    void setRoda(int roda){
        this.roda = roda;
    }
    int getRoda(){
        return roda;
    }
    void setMesin(int mesin){
        this.mesin = mesin;
    }
    int getMesin(){
        return mesin;
    }
}

