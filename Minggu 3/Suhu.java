import java.util.Scanner;

public class Suhu{
    int c;
    float hsl;
    public Suhu(){}
    public Suhu(int c){
        this.c = c;
    }
    Scanner sc = new Scanner(System.in);

    void setC(int c){
        this.c = c;
    }

    int getC(){
        return c;
    }

    void inputC(){
        System.out.print("Enter Celcius : ");c=sc.nextInt();
    }

    void cToK(int c){
        hsl = c + 273.15f;
        System.out.println(c+ " c " +hsl+ " K");
    }

    float cToK(float c){
        return c+273.15f;
    }

    void cToF(int c){
        hsl = c + 1.8f + 32;
        System.out.println(c+ " c = " + hsl + " F");
    }

    float cToF(float c){
        return c+1.8f+32;
    }
}