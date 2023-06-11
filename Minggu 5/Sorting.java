import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;

public class Sorting {
    Scanner input = new Scanner(System.in);

    static int n;
    static int array[] = new int[5];
    static int array2[] = new int[5];
    static int start = 0;
    static int end = array.length - 1;

    Sorting(int sort){
        n = sort;
        System.out.print("Masukkan Array : ");
        for(int i = 0; i < n; i++){
            array[i] = input.nextInt();
            array2[i] = array[i];
        }
        System.out.println();
    }

    static void reset(){
        array = array2;
    }

    static void tampil(){
        for(int i= 0; i < n; i++){
            System.out.println(array[i] + " ");
        }
    }

    class bubble {
        static void sortBubble() {
            int temp = 0;
            for(int i = 0; i < n; i++){
                for(int j = 1; j < (n - i); j++){
                    if(array[j - 1] > array[j]){
                        temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                    }
                }
                System.out.printf("Bubble ke - %d   : ", i + 1);
                tampil();
                System.out.println();
            }
            System.out.println("=================================");
        }
    }

    class insertion {
        static void sortInsertion(){
            for(int j = 1; j < n; j++){
                int temp = array[j];
                int i = j - 1;
                while((i > -1) && (array[i] > temp)){
                    array[i + 1] = array[i];
                    i--;
                }
                array[i + 1] = temp;
                System.out.print("Insertion ke - " + j + " : ");
                tampil();
                System.out.println();
            }
            System.out.println("==================================");
        }
    }

    class quick {
        static int partition(int a[], int awal, int akhir){
            int pivot = a[akhir];
            int i = (awal - 1);
            for(int j = awal; j <= akhir - 1; j++){
                if(a[j] < pivot){
                    i++;
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
            int t = a[i + 1];
            a[i + 1] = a[akhir];
            a[akhir] = t;
            return (i + 1);
        }

        static void sortQuick(int a[], int awal, int akhir){
            if(awal < akhir) {
                int p = partition(a, awal, akhir);
                sortQuick(a, awal, p - 1);
                sortQuick(a, p + 1, akhir);
            }
        }
    }

    class selection {
        static void sortSelection() {
            for (int i = 0; i < array.length - 1; i++){
                int index = 1;
                for(int j = i + 1; j < array.length; j++){
                    if(array[j] < array[index]){
                        index = j;
                    }
                }
                int angkaKecil = array[index];
                array[index] = array[i];
                array[i] = angkaKecil;
                System.out.printf("Bubble ke - %d : ", i + 1);
                tampil();
                System.out.println();
            }
            System.out.println("=======================================");
        }
    }

    class merge {
        static void merge(int a[], int beg, int tengah, int akhir) {
            int i, j, k;
            int x1 = tengah - beg + 1;
            int x2 = akhir - tengah;

            int arrayKiri[] = new int[x1];
            int arrayKanan[] = new int[x2];

            for (i = 0; i < x1; i++){
                arrayKiri[i] = a[beg + i];
            }
            for (j = 0; j < x2; j++){
                arrayKanan[j] = a[tengah + 1 + j];
            }

            i = 0;
            j = 0;
            k = beg;

            while (i < x1 && j < x2) {
                if (arrayKiri[i] <= arrayKanan[j]){
                    a[k] = arrayKiri[i];
                    i++;
                }
                else {
                    a[k] = arrayKanan[j];
                    j++;
                }
                k++;
            }

            while (i < x1){
                a[k] = arrayKiri[i];
                i++;
                k++;
            }

            while (j < x2) {
                a[k] = arrayKanan[j];
                j++;
                k++;
            } 
        }

        static void sortMerge(int a[], int beg, int akhir){
            if (beg < akhir) {
                int tengah = (beg + akhir) / 2;
                sortMerge(a, beg, tengah);
                sortMerge(a, tengah + 1, akhir);
                merge(a, beg, tengah, akhir);
            }
        }
    }
}