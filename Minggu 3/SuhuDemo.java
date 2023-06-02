public class SuhuDemo{
    public static void main(String[] a){
        Suhu suhuku = new Suhu();
        suhuku.setC(30);
        suhuku.cToK(suhuku.getC());
        suhuku.inputC();
        suhuku.cToK(suhuku.getC());
        suhuku.cToF(suhuku.getC());
        Suhu suhumu = new Suhu(36);
        suhumu.cToK(suhumu.c);
        suhumu.inputC();
        suhumu.cToK(suhumu.getC());
        suhumu.cToF(suhumu.c);
        fungsiStatic();
        //fungsiBiasa();
    }

    static void fungsiStatic(){
        System.out.println("tes static method");
    }

    void fungsiBiasa(){
        System.out.println("tes method biasa");
    }
}