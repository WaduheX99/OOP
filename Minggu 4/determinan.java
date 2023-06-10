import java.util.Scanner;
  
public class determinan{
    public static void main(String args[]){
            
        Scanner input = new Scanner(System.in);
            
        double a, b, c, D, x1, x2;
        String punya;

        String retry;
        do{
            System.out.print("Determinan siapa : ");
            punya = input.next();
            System.out.print("Input nilai a : ");
            a = input.nextDouble();
            System.out.print("Input nilai b : ");
            b = input.nextDouble();
            System.out.print("Input nilai c : ");
            c = input.nextDouble();
            System.out.println("Nilai a : "+a);
            System.out.println("Nilai b : "+b);
            System.out.println("Nilai c : "+c);
                
            D = (b*b)-(4*a*c);
            System.out.println("Determinan = "+D);
                
            if (D>0){
                x1 = (-b + Math.sqrt(D))/(2*a);
                x2 = (-b - Math.sqrt(D))/(2*a);
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
            }
            else if (D==0){
                x1 = x2 = (-b/(2*a));
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
            }
            else {
                x1 = (-b/(2*a)+(Math.sqrt(-D)/(2*a)));
                x2 = (-b/(2*a)-(Math.sqrt(-D)/(2*a)));
                System.out.println("x1 = "+x1);
                System.out.println("x2 = "+x2);
            }
            System.out.print("Jawab [Y/T] : ");retry=input.next();  
        }while(retry.equals("Y") || retry.equals("y"));
    }
}