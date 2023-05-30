import java.util.Scanner;

public class lingkaran{
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        float phi = 3.14f;
        int r;
        System.out.println("--- Lingkaran ---");
        System.out.print("Jari-jari    : ");r=input.nextInt();
        System.out.println("Diameter    : "+2*r);
        System.out.println("Keliling    : "+2*phi*r);
        System.out.println("Luas        : "+phi*r*r);
    }
}  