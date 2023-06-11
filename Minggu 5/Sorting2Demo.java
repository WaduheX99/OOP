import java.util.Scanner;

public class Sorting2Demo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Bilangan : ");
        int index = input.nextInt();
        int[] arr = new int[index];
        int[] arrReset = new int[index];
        boolean shouldBreak = false;
        System.out.print("Masukkan bilangan : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            arrReset[i] = arr[i];
        }
        do {
            System.out.println("==== SORTING PROGRAM ====");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Quick Sort");
            System.out.println("3. Insertion Sort");
            System.out.println("4. Selection Sort");
            System.out.println("5. Merge Sort");
            System.out.println("6. Exit");
            System.out.print("\nPilihan : ");
            int pilih = input.nextInt();
            switch (pilih) {
                case 1 -> {
                    Sorting2.bubbleSort(arr);
                }
                case 2 -> {
                    Sorting2.quickSort(arr, 0, arr.length-1);
                }
                case 3 -> {
                    Sorting2.insertionSort(arr);
                }
                case 4 -> {
                    Sorting2.selectionSort(arr);
                }
                case 5 -> {
                    Sorting2.mergeSort(arr, 0, arr.length - 1);
                }
                case 6 -> {
                    System.exit(0);
                }
                default -> System.out.println("Opsi tidak valid");
            }

            for (int i = 0; i < arr.length; i++) {
                arr[i] = arrReset[i];
            }
            if (shouldBreak) break;
        } while (true);
        input.close();
    }
}