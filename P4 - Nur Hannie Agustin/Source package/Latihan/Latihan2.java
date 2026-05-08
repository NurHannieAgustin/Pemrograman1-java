import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // =================
        // INPUT
        // =================
        System.out.print("Input Makan : ");
        float makan = input.nextFloat();

        System.out.print("Input Transport : ");
        float transport = input.nextFloat();

        System.out.print("Input Belanja : ");
        float belanja = input.nextFloat();

        // =================
        // PROSES
        // =================
        float total = makan + transport + belanja;

        float p_makan = (makan / total) * 100;
        float p_transport = (transport / total) * 100;
        float p_belanja = (belanja / total) * 100;

        // =================
        // OUTPUT
        // =================
        System.out.println("\n===== HASIL =====");
        System.out.println("Total = " + total);

        System.out.printf("Persentase Makan = %.2f%%\n", p_makan);
        System.out.printf("Persentase Transport = %.2f%%\n", p_transport);
        System.out.printf("Persentase Belanja = %.2f%%\n", p_belanja);
    }
}