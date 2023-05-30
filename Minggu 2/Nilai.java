import java.util.Scanner;

public class Nilai{
    String nim, nama;
    float tgs, uts, uas, pTgs, pUts, pUas, na;
    Scanner sc = new Scanner(System.in);
    public Nilai (String nim, String nama, float tgs, float uts, float uas){
        this.nim = nim;
        this.nama = nama;
        this.tgs = tgs;
        this.uts = uts;
        this.uas = uas;
    }
    public Nilai(){}
    void isiData(){
        System.out.print("Nim       :   "); nim=sc.next();
        System.out.print("Nama      :   "); nama=sc.next();
        System.out.print("Tugas     :   "); tgs=sc.nextFloat();
        System.out.print("UTS       :   "); uts=sc.nextFloat();
        System.out.print("UAS       :   "); uas=sc.nextFloat();
    }

    void hitungNilai(){
        pTgs = 0.2f*tgs;
        pUts = 0.35f*uts;
        pUas = 0.45f*uas;
        na = pTgs+pUts+pUas;
    }

    void cetakNilai(){
        System.out.println("NIM         : "+nim);
        System.out.println("Nama        : "+nama);
        System.out.println("Nilai Tugas : "+tgs+ "  20%     : "+pTgs);
        System.out.println("Nilai UTS   : "+uts+ "  35%     : "+pUts);
        System.out.println("Nilai UAS   : "+uas+ "  40%     : "+pUas);
        System.out.println("Nilai Akhir : "+na);

    }
}