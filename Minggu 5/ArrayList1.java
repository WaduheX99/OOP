import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> nilai1 = new ArrayList<Integer>();
        ArrayList<Integer> nilai2 = new ArrayList<Integer>();
        ArrayList<Integer> jumlah = new ArrayList<Integer>();
        ArrayList<Integer> kurang = new ArrayList<Integer>();
        ArrayList<Integer> kali = new ArrayList<Integer>();
        ArrayList<Float> bagi = new ArrayList<Float>();
        System.out.println("Nilai 1");
        for (int i = 0; i < 5; i++) {
            nilai1.add(i);
            System.out.println("Index ke " + i + " = " + nilai1.get(i));
        }
        System.out.println();
        
        System.out.println("Nilai 2");
        for (int i = 0; i < 5; i++) {
            nilai2.add(i);
            System.out.println("Index ke " + i + " = " + nilai2.get(i));
        }
        System.out.println();

        // Penjumlahan
        for (int i = 0; i < 5; i++) {
            jumlah.add(nilai1.get(i) + nilai2.get(i));
        }
        System.out.println("Hasil PENJUMLAHAN nilai 1 + nilai 2");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hasil index ke " + i + " = " + jumlah.get(i));
        }
        System.out.println();

        // Pengurangan
        for (int i = 0; i < 5; i++) {
            kurang.add(nilai1.get(i) - nilai2.get(i));
        }
        System.out.println("Hasil PENGURANGAN nilai 1 + nilai 2");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hasil index ke " + i + " = " + kurang.get(i));
        }
        System.out.println();

        // Perkalian
        for (int i = 0; i < 5; i++) {
            kali.add(nilai1.get(i) * nilai2.get(i));
        }
        System.out.println("Hasil PERKALIAN nilai 1 + nilai 2");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hasil index ke " + i + " = " + kali.get(i));
        }
        System.out.println();

        // Pembagian
        for (int i = 0; i < 5; i++) {
            bagi.add((float) (nilai1.get(i) / (float)nilai2.get(i)));
        }
        System.out.println("Hasil PEMBAGIAN nilai 1 + nilai 2");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hasil index ke " + i + " = " + bagi.get(i));
        }
    }
}