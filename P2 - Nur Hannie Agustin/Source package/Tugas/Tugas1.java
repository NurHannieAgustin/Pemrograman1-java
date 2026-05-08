import java.util.Scanner;

public class Tugas1 {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // INPUT
        String nama;
        int usia;

        System.out.print("Masukkan Nama : ");
        nama = input.nextLine();

        System.out.print("Masukkan Usia : ");
        usia = input.nextInt();

        // PROSES
        String status;
        if (usia >= 18) {
            status = "Dewasa";
        } else {
            status = "Belum Dewasa";
        }

        // HASIL
        System.out.println("\n=== HASIL DATA ===");
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
        System.out.println("Status : " + status);
    }
}