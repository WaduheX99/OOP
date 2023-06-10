import java.util.Scanner;

public class KonversiDetikDemo {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        String retry;
        KonversiDetik konversi = new KonversiDetik();
        do{
            konversi.inputDetik();
            konversi.konversiDetik();
            konversi.tampilDetik();
            System.out.print("Input data lagi [Y/T] ? : "); retry = input.next();
            System.out.println();
        }while(retry.equals("Y") || retry.equals("y"));
    }
}