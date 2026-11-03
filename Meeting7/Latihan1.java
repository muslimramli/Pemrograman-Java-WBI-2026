// 85-100 => A
// 75-84 => B+
// 70-74 => B
// 65-69 => C+ => Negok2 dosen
// 55-64=> C => Perbaiki
// 40-54=>D => tidak lulus
// 0-39 => E => Tidak lulus

// Source code is decompiled from a .class file using FernFlower decompiler (from Intellij IDEA).

import java.util.Scanner;

public class Latihan1 {
   public Latihan1() {
   }

   public static void main(String[] var0) {
      Scanner input = new Scanner(System.in);
      
    //   input nama mahasiswa
      System.out.println("Masukan Nama Anda:");
      String nama = input.nextLine();

    //   input nilai mahsiswa
    System.out.println("Masukan Nilai Anda:");
    int nilai=input.nextInt();

    //Bikin aturan nilai

    if (nilai>=85 && nilai<=100) {
        System.out.println("Hai "+ nama+ "! Nilai Anda adalah: A");
        
    }
    else if (nilai>=75 && nilai<=84) {
         System.out.println("Hai "+ nama+ "! Nilai Anda adalah: B+");
    }

    else if (nilai>=70 && nilai<=74) {
         System.out.println("Hai "+ nama+ "! Nilai Anda adalah: B");
    }
    else if (nilai>=65 && nilai<=69) {
         System.out.println("Hai "+ nama+ "! Nilai Anda adalah: C+");
    }
    else if (nilai>=55 && nilai<=64) {
         System.out.println("Hai "+ nama+ "! Nilai Anda adalah: C");
    }
    else if (nilai>=40 && nilai<=54) {
         System.out.println("Hai "+ nama+ "! Nilai Anda adalah: D");
    }
    else if (nilai>=0 && nilai<=39) {
         System.out.println("Hai "+ nama+ "! Nilai Anda adalah: E");
    }
    else {
        System.out.println("Nilai yang Anda masukan salah! Nilai harus 0-100");
    }

      
   }
}
