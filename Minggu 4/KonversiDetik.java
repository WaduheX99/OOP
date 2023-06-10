import java.util.Scanner;

public class KonversiDetik {
    int detik, menit, jam, hari;
    Scanner input = new Scanner(System.in);
    public KonversiDetik(){}
    public KonversiDetik(int detik){
        this.detik = detik;
    }

    void inputDetik(){
        System.out.println("============ Input Detik ==============");
        System.out.print("Masukkan Detik : "); detik = input.nextInt();
        System.out.println();
    }

    void konversiDetik(){
        int sisaMenit, sisaJam, sisaHari;
        hari = detik / 86400;
        sisaHari = detik % 86400;
        jam = sisaHari / 3600;
        sisaJam = sisaHari % 3600;
        menit = sisaJam / 60;
        sisaMenit = sisaJam % 60;
        detik = sisaMenit;
    }

    void tampilDetik(){
        System.out.println("=========== Hasil Konversi ============");
        System.out.println("Hari : " + hari);
        System.out.println("Jam : " + jam);
        System.out.println("Menit : " + menit);
        System.out.println("Detik : " + detik);
    }
}