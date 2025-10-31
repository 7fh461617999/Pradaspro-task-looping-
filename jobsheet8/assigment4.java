package jobsheet8;

import java.util.Arrays;
import java.util.Scanner;

public class assigment4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] sports = { "Badminton", "Table Tennis", "Basketball", "Volleyball" };
        String[][] athletes = new String[sports.length][5];
        System.out.println("=== Input Data polinema porseni Athlites 2024 ===");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < sports.length; i++) {
            System.out.println("\ninput the sports: " + sports[i]);
            for (int j = 0; j < athletes[i].length; j++) {
                System.out.print("  input name Athlite " + (j + 1) + ": ");
                athletes[i][j] = input.nextLine();
            }
            Arrays.sort(athletes[i]);
        }
        System.out.println("\n\n=== Daftar Nama Atlet Porseni (Urut Alfabetis) ===");
        System.out.println("----------------------------------------------------");

        int sportIndex = 0;
        for (String[] sportRow : athletes) {
            System.out.println("\n### " + sports[sportIndex] + " ###");
            for (String name : sportRow) {
                System.out.println("  - " + name);
            }

            sportIndex++;
        }
        input.close();
    }
}
