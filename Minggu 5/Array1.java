import java.util.Scanner;

public class Array1{
    Scanner input = new Scanner(System.in);
    int data;

    void cetak(){
        System.out.print("Jumlah Data   : "); data = input.nextInt();
        int[] isi = new int[data];
        for(int i = 0; i < data; i++){
            System.out.printf("Data ke - %d = ", i + 1);
            isi[i] = input.nextInt();
        }
        for(int i = 0; i < data; i++){
            System.out.printf("Hasil nilai [%d] = %d%n", i, isi[i]);
        }
    }
}