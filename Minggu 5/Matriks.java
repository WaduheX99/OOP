import java.util.Scanner;

public class Matriks {
    public static void penjumlahan(int[][] a, int[][] b, int barisA, int
    kolomA, int barisB, int kolomB) {
        int[][] sum = new int[barisA][kolomA];
        if (kolomA == kolomB || barisA == barisB) {
            for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
            sum[i][j] = a[i][j] + b[i][j];
            }
            }
            System.out.println("\nHASIL PENJUMLAHAN");
            cetakMatrix(sum, barisA, kolomA);
        } 
        else {
            System.out.println("Operasi tidak dapat dilakukan!");
            System.out.println("Karena kedua Matrix memiliki ordo yang berbeda");
        }
    }

    public static void perkalian(int[][] a, int[][] b, int barisA, int kolomA,
    int barisB, int kolomB) {
        int[][] sum = new int[barisA][kolomB];
        if (kolomA == barisB) {
            for (int i = 0; i < barisA; i++) {
                for (int j = 0; j < kolomB; j++) {
                    for (int k = 0; k < kolomA; k++) {
                        sum[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            cetakMatrix(sum, barisA, kolomB);
        } 
        else {
            System.out.println("Operasi tidak dapat dilakukan!");
            System.out.println("Karena Baris pada Matrix kedua != Kolom Matrix pertama");
        }
    }

    private static void transpose(int[][] arr, int baris, int kolom) {
        int[][] sum = new int[baris][kolom];
        for (int i = 0; i < baris; ++i) {
            for (int j = 0; j < kolom; ++j) {
                sum[j][i] = arr[i][j];
            }
        }
        cetakMatrix(sum, baris, kolom);
    }

    private static void cetakMatrix(int[][] arr, int baris, int kolom) {
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(arr[i][j] + "\t");
                if (j == kolom - 1) {
                    System.out.println();
                }
            }
        }
    }

    public static void transposeMenu(int[][] a, int[][] b, int barisA, int
    kolomA, int barisB, int kolomB) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n==== PILIH TRANSPOSE ====");
        System.out.println("1. Matriks A");
        System.out.println("2. Matriks B");
        System.out.println("3. Matriks A + B");
        System.out.print("\nMasukkan pilihan : ");
        int pilih = input.nextInt();
        int[][] sum;
        if (pilih == 1) {
            System.out.println("Hasil transpose A");
            transpose(a, barisA, kolomA);
        } 
        else if (pilih == 2) {
            System.out.println("Hasil transpose B");
            transpose(b, barisB, kolomB);
        } 
        else if (pilih == 3) {
            sum = new int[barisA][kolomA];
            if (kolomA == kolomB || barisA == barisB) {
                for (int i = 0; i < barisA; i++) {
                    for (int j = 0; j < kolomA; j++) {
                        sum[i][j] = a[i][j] + b[i][j];
                    }
                }
                cetakMatrix(sum, barisA, kolomA);
                System.out.println("Hasil transpose");
                transpose(sum, barisA, kolomA);
            } 
            else {
                System.out.println("Operasi tidak dapat dilakukan!");
                System.out.println("Karena kedua Matrix memiliki ordo yang berbeda");
            }
        }
    }
}