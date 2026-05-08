import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input Realisasi : ");
        float realisasi = input.nextFloat();

        System.out.print("Input Kehadiran : ");
        float kehadiran = input.nextFloat();

        System.out.print("Input Tugas : ");
        float tugas = input.nextFloat();

        System.out.print("Input UTS : ");
        float uts = input.nextFloat();

        System.out.print("Input UAS : ");
        float uas = input.nextFloat();

        float b_kehadiran = kehadiran / realisasi * 10;
        float b_tugas = tugas * 20 / 100;
        float b_uts = uts * 30 / 100;
        float b_uas = uas * 40 / 100;

        float total = b_kehadiran + b_tugas + b_uts + b_uas;

        System.out.println("Total Nilai : " + total);
    }
}