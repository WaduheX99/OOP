import java.util.Scanner;

public class Faktorial {  
    int bil, hasil;
    int temp = 1;
    Scanner input = new Scanner(System.in);

    void hitung(){
        System.out.print("Bilangan : " ); bil = input.nextInt();
        if (bil == 0 || bil == 1){
            System.out.println("1 x 1 = 1");
        }
        else if(bil == 2){
            System.out.println("1 x 2 = 2");
        }
        else {
            for (int i = 2; i <= bil; i++ ){
                System.out.print(temp+ " x " + i + " = ");
                hasil = temp * i;
                temp = hasil;
                System.out.println(hasil);
            }
        }
    }    
}