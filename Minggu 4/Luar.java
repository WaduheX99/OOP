public class Luar {
    void cetakLuar(){
        System.out.println("cetak Luar......");
    }
    class Tengah{
        void cetakTengah(){
            cetakLuar();
            System.out.println("cetak Tengah......");
        }
        class Dalam{
            void cetakDalam(){
                cetakLuar();
                cetakTengah();
                System.out.println("cetak Dalam......");
            }
        }
    }
}