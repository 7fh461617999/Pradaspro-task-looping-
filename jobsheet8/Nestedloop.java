package jobsheet8;
import java.util.Scanner;
public class Nestedloop {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);
        Double [][] temps = new Double[5][7];
        for (int i = 0; i < temps.length; i++) {
            System.out.println("city: "+(i+1));
            for (int j = 0; j < temps[0].length; j++) {
                System.out.println("day "+(j+1)+": ");
                temps[i][j] = Scanner.nextDouble();
            }
            System.out.println();
        }
        int cityIndex = 0;
        for (Double[] cityTemps : temps) {
            System.out.println("City: " + cityIndex); 
            for (double temp : cityTemps) {
                System.out.print(temp + " ");
            }
            System.out.println();
            cityIndex++; 
        }
        Scanner.close();
        }
    }

