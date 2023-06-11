import java.util.Scanner;

public class NilaiDemo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int jumlah;
        System.out.print("Masukkan jumlah Mahasiswa : ");
        jumlah = input.nextInt();
        Nilai[] mine = new Nilai[jumlah];
        for(int i = 0; i < jumlah; i++){
            System.out.println("Mahasiswa ke " + (i + 1));
            mine[i] = new Nilai();
            mine[i].isiData();
            mine[i].hitungNilai();
            mine[i].cetakNilai();
            System.out.println("============================");
        }
        Nilai.judul();
        for(int i = 0; i < jumlah; i++){
            mine[i].daftarNilai();
        }
    }
}