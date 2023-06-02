public class MatematikaDemo{
    public static void main(String[] args){
        Matematika mtkku = new Matematika();
        mtkku.pertambahan(10,8);
        System.out.println("Pertambahan : " + mtkku.pertambahan(10.8f, 7.9f));
        System.out.println("Pertambahan : " + mtkku.pertambahan(10.8f, 7.9f, 19.6f));
        mtkku.perkalian(10,8);
        System.out.println("Perkalian   : " + mtkku.perkalian(10.8f, 7.9f));
        mtkku.pembagian(10,8);
        System.out.println("Pembagian   : " + mtkku.pembagian(10.8f, 7.9f));
    }
}