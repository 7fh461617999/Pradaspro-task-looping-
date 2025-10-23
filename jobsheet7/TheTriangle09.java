package jobsheet7;
import java.util.Scanner;
public class TheTriangle09 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numInput, i =0 ;
    String s = " ";
    System.out.print("input some number: ");
    numInput = input.nextInt();
    while (i<numInput) {
        s += " *";
        System.out.println(s);
        i++;
    }
    }
}
