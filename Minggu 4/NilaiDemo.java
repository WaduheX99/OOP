import java.util.Scanner;

public class NilaiDemo{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String retry;
        Nilai mine = new Nilai();
        do{
            mine.isiData();
            mine.hitungNilai();
            mine.cetakNilai();
            System.out.print("Jawab [Y/T] : ");retry=input.next();
            System.out.println();
        }while(retry.equals("Y") || retry.equals("y"));
    }
}