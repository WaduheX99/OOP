import java.util.Scanner;

public class persegi{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        int panjang;
        int lebar;
        System.out.println("--- Persegi ---");
        System.out.print("Panjang     : ");panjang=input.nextInt();
        System.out.print("Lebar       : ");lebar=input.nextInt();
        System.out.println("Keliling    : "+2*(panjang+lebar));
        System.out.println("Luas        : "+panjang*lebar);
    }
}