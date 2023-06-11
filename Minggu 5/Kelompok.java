import java.util.Scanner;

public class Kelompok {
    int bil, pecah;
    int awal = 0;

    Scanner input = new Scanner(System.in);

    void cetak(){
        System.out.print("Bilangan  : "); bil = input.nextInt();
        do {
            for (int i = 0; i < 5; i++){
                awal++;
                System.out.print(awal + " ");
                if (awal == bil) {
                    break;
                }
            }
            System.out.println(); 
        }while(awal != bil);
    }

    void dipecah(){
        System.out.print("Dipecah : "); pecah = input.nextInt();
        awal = 0;
        do {
            for (int i = 0; i < pecah; i++){
                awal++;
                System.out.print(awal + " ");
                if (awal == bil) {
                    break;
                }
            }
            System.out.println(); 
        }while(awal != bil);
    }
}