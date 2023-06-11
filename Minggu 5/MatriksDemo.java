import java.util.Scanner;

public class MatriksDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean selesai = false;
        System.out.print("Input baris Matrix A = ");
        int rowA = input.nextInt();
        System.out.print("Input kolom Matrix A = ");
        int columnA = input.nextInt();
        int[][] matrixA = new int[rowA][columnA];
        for (int i = 0; i < rowA; i++) {
            for (int j = 0; j < columnA; j++) {
                System.out.print("Input elemen Matrix A [" + i + "," + j + "] = ");
                matrixA[i][j] = input.nextInt();
            }
        }
        System.out.print("Input baris Matrix B = ");
        int rowB = input.nextInt();
        System.out.print("Input kolom Matrix B = ");
        int columnB = input.nextInt();
        int[][] matrixB = new int[rowB][columnB];
        for (int i = 0; i < rowB; i++) {
            for (int j = 0; j < columnB; j++) {
                System.out.print("Input elemen Matrix B [" + i + "," + j + "] = ");
                matrixB[i][j] = input.nextInt();
            }
        }

        while (true) {
            System.out.println("\n==== MATRIX ====");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Perkalian");
            System.out.println("3. Transpose");
            System.out.println("4. Exit");
            System.out.print("\nMasukkan pilihan : ");
            int choose = input.nextInt();
            switch (choose) {
                case 1 -> {
                    Matriks.penjumlahan(matrixA, matrixB, rowA, columnA, rowB, columnB);
                }
                case 2 -> {
                    Matriks.perkalian(matrixA, matrixB, rowA, columnA, rowB, columnB);
                }
                case 3 -> {
                    Matriks.transposeMenu(matrixA, matrixB, rowA, columnA, rowB, columnB);
                }
                case 4 -> {
                    System.exit(0);
                }
                default -> {
                    System.out.println("Opsi tidak valid!");
                }
            }
            if (selesai){
                break;
            }
        }
        input.close();
    }
}