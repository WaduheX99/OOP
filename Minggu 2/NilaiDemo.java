public class NilaiDemo{
    public static void main(String[] args){
        Nilai nilaisy = new Nilai("A11.2021.13917", "Faza Faresha Affandi", 85f, 83f, 90f);
        nilaisy.isiData();
        nilaisy.hitungNilai();
        System.out.println("----------------------");
        nilaisy.cetakNilai();
    }
}