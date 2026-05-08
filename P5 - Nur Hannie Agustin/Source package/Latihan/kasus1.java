import java.util.Scanner;

public class kasus1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input Kehadiran : ");
        float kehadiran = input.nextFloat();

        System.out.print("Input Total Nilai : ");
        float nilai = input.nextFloat();


        float validasi = 21 * 75 / 100;

        String grade;

        if (kehadiran >= validasi) {
            if (nilai >= 85)
                grade = "A";
            else if (nilai >= 70)
                grade = "B";
            else if (nilai >= 60)
                grade = "C";
            else if (nilai >= 50)
                grade = "D";
            else
                grade = "E";

        } else {
            if (nilai >= 55)
                grade = "D";
            else
                grade = "E";
        }

        System.out.println("\n===== HASIL =====");
        System.out.println("Kehadiran : " + kehadiran);
        System.out.println("Nilai : " + nilai);
        System.out.println("Grade : " + grade);
    }
}