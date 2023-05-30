public class Tugas2{
    public static void main(String args[]){
        persegi(4,5);
        segitiga(10,12);
        lingkaran(10);
        kubus(4);
    }

    static void persegi(int p, int l){
        System.out.println("--- Persegi ---");
        System.out.println("Panjang     : "+p);
        System.out.println("Lebar       : "+l);
        System.out.println("Keliling    : "+2*(p+l));
        System.out.println("Luas        : "+p*l);
    }

    static void segitiga(int a, int t){
        double pythagoras = Math.sqrt((a/2*a) + (t*t));
        System.out.println("--- Segitiga ---");
        System.out.println("Alas        : "+a);
        System.out.println("Tinggi      : "+t);
        System.out.println("Keliling    : "+pythagoras*2 + a);
        System.out.println("Luas        : "+a*t/2);
    }

    static void lingkaran(int r){
        float phi = 3.14f;
        System.out.println("--- Lingkaran ---");
        System.out.println("Jari-jari   : "+r);
        System.out.println("Diameter    : "+2*r);
        System.out.println("Keliling    : "+2*phi*r);
        System.out.println("Luas        : "+phi*r*r);
    }

    static void kubus(int s){
        System.out.println("--- Kubus ---");
        System.out.println("Sisi        : "+s);
        System.out.println("Luas Alas   : "+s*s);
        System.out.println("Keliling    : "+12*s);
        System.out.println("Volume      : "+s*s*s);
    }
}