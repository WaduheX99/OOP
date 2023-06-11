import java.util.Scanner;

public class Nilai{
    String nim, nama;
    float tgs, uts, uas, pTgs, pUts, pUas, na;
    Scanner sc = new Scanner(System.in);
    char nilaiHuruf;
    String predikat;
    public Nilai (String nim, String nama, float tgs, float uts, float uas){
        this.nim = nim;
        this.nama = nama;
        this.tgs = tgs;
        this.uts = uts;
        this.uas = uas;
    }
    public Nilai (){}
    void isiData(){
        System.out.println("======== Isi Data ========");
        System.out.print("Nim           :   "); nim=sc.next();
        System.out.print("Nama          :   "); nama=sc.next();
        System.out.print("Nilai Tugas   :   "); tgs=sc.nextFloat();
        System.out.print("Nilai UTS     :   "); uts=sc.nextFloat();
        System.out.print("Nilai UAS     :   "); uas=sc.nextFloat();
    }

    void hitungNilai(){
        pTgs = 0.2f*tgs;
        pUts = 0.35f*uts;
        pUas = 0.45f*uas;
        na = pTgs+pUts+pUas;
    }

    void cetakNilai(){
        System.out.println("========= Hasil =========="); 
        System.out.println("NIM         : "+nim);
        System.out.println("Nama        : "+nama);
        System.out.println("Nilai Tugas : "+tgs+ "  20%     : "+pTgs);
        System.out.println("Nilai UTS   : "+uts+ "  35%     : "+pUts);
        System.out.println("Nilai UAS   : "+uas+ "  40%     : "+pUas);
        System.out.println("Nilai Akhir : "+na);
        System.out.println("Nilai Huruf : "+getHuruf(na));
        System.out.println("Predikat    : "+getPredikat(nilaiHuruf));
    }

    void setNim(String nim){
        this.nim = nim;
    }

    String getNim(){
        return nim;
    }

    char getHuruf(float nilai){
        if(nilai >= 85)
            nilaiHuruf='A';
        else if(nilai >= 70 && nilai < 85)
            nilaiHuruf='B';
        else if(nilai>=60 && nilai<70)
            nilaiHuruf='C';
        else if(nilai>=40 && nilai<60)
            nilaiHuruf='D';
        else
            nilaiHuruf='E';
        return nilaiHuruf;
    }

    String getPredikat(char huruf){
        switch(huruf){
            case 'A':
                predikat="Apik";
                break;
            case 'B':
                predikat="Baik";
                break;
            case 'C':
                predikat="Cukup";
                break;
            case 'D':
                predikat="Dablek";
                break;
            default:
                predikat="Elek";
                break;
        }
        return predikat;
    }

    static void judul(){
        System.out.println("Daftar nilai PBO : ");
        System.out.println("================================");
        System.out.println("Nim\tNama\tN.tgs\tN.Uts\tN.Uas\tN.Akhir\tN.Huruf\tPerdikat");
    }

    void daftarNilai(){
        System.out.println(nim + "\t" + nama + "\t" + tgs + "\t" + uts + "\t" + uas + "\t" + na + "\t" + getHuruf(nilaiHuruf) + "\t" + getPredikat(nilaiHuruf));
    }
}