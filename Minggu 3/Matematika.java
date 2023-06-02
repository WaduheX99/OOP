public class Matematika{
    float hasil;
    int hsl;

    void pertambahan(int a, int b){
        hsl = a+b;
        System.out.println("Pertambahan : " +a+ " + " +b+ " = " +hsl);
    }

    float pertambahan(float a, float b) {
        return a+b;
    }

    float pertambahan(float a, float b, float c){
        return a+b+c;
    }

    void perkalian(int a, int b){
        hsl = a*b;
        System.out.println("Perkalian   : " +a+ " x " +b+ " = " +hsl);
    }

    float perkalian(float a, float b){
        return a*b;
    }

    void pembagian(int a, int b){
        hasil = a/b;
        System.out.println("Pembagian   : " +a+ " / " +b+ " = " +hasil);
    }

    float pembagian(float a, float b){
        return a/b;
    }
}