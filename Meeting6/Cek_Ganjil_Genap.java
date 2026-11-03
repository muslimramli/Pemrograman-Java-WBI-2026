package Meeting6;
import java.util.Scanner;
public class Cek_Ganjil_Genap {
    public static void main(String[] args) {
         Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Masukan sebuah bilangan:"); // pesan untuk user

        int bilangan = myObj.nextInt();  // Baca user input
        if (bilangan%2==0) {
            System.out.println("Bilangan Genap!");
            
        }
        else {
            System.out.println("Bilangan ganjil!");
        }

    }
    
}


//%=> Modulus => Sisa Bagi
//2:2= 1, sisa =0
//5:2 = 2, sisa =1
//26:27 =0 sisa bagi:27
//27:26 = 1 sisa 1

// Semua bilangan yang habis dibagi 2, enggak ada sisa bagi berarti
// bilanagan GENAP. Kalau sisa bagi 1, sudah pasti ganjil.

// 20:2 = 10 sisa 0
// 21:2 = 10 sisa 1
// 1003 :2 501, sisa 1