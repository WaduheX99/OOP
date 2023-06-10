import java.util.Scanner;

public class PenjualanDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String retry;
        Penjualan penjualan = new Penjualan();
        do{
            penjualan.inputData();
            penjualan.getTotalPembelian();
            penjualan.getBonus();
            penjualan.cetakNota();
            System.out.print("Jawab [Y/T] : ");retry=input.next();
            System.out.println();
        }while(retry.equals("Y") || retry.equals("y"));
    }
}