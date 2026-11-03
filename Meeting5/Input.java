import java.util.Scanner;  // Wajib ada scanner input
public class Input {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Masukan nama Anda:"); // pesan untuk user

        String nama = myObj.nextLine();  // Baca user input

        System.out.println("Masukan umur Anda: ");
        int umur=myObj.nextInt();

        int tahun_sekarang=2026;
        int tahun_lahir=tahun_sekarang-umur;
        

        System.out.println("Halo "+ nama +"! Anda lahir tahun "+ tahun_lahir ); //tampilkan hasil input oleh user
    }
    
}
