import java.util.Scanner;

public class Penjualan {

    Scanner sc = new Scanner(System.in);
    String kode, nama, bonus;
    float harga;
    int jumlah, totalpembelian;

    void setData(String kode, String nama, float harga, int jumlah){
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    public Penjualan() {}

    void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("===========Input Barang============");
        System.out.print("Kode Barang   : "); kode = sc.next();
        System.out.print("Nama Barang   : "); nama = sc.next();
        System.out.print("Harga         : "); harga = sc.nextFloat();
        System.out.print("Jumlah        : "); jumlah = sc.nextInt();
        System.out.println();
    }

    int getTotalPembelian(){
        totalpembelian = jumlah * (int)harga;
        return totalpembelian;
    }

    void getBonus(){
        if(totalpembelian >= 500000 && jumlah > 5)
            bonus = "Setrika";
        else if(totalpembelian >= 100000 && jumlah > 3)
            bonus = "Payung";
        else if(totalpembelian >= 50000 || jumlah > 2)
            bonus = "Ballpoint";
        else
            bonus = "Tidak ada bonus";
    }

    void cetakNota()
    {
        System.out.println("=====================================");
        System.out.println(" NOTA PEMBELIAN BARANG ");
        System.out.println("=====================================");
        System.out.println("Kode Barang : " + kode);
        System.out.println("Nama Barang : " + nama);
        System.out.println("Harga       : " + harga);
        System.out.println("Jumlah      : " + jumlah);
        System.out.println("Total       : " + getTotalPembelian());
        System.out.println("Bonus       : " + bonus);
    }
}