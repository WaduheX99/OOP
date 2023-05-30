import java.util.Scanner;

public class kubus{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        int s;
        System.out.println("--- Kubus ---");
        System.out.print("Sisi        : ");s=input.nextInt();
        System.out.println("Luas Alas   : "+s*s);
        System.out.println("Keliling    : "+12*s);
        System.out.println("Volume      : "+s*s*s);
    }
}  