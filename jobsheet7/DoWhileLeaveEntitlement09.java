package jobsheet7;

import java.util.Scanner;

public class DoWhileLeaveEntitlement09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int leaveEntitlement = 0, numLeave;
        String confirmation = "";
        System.out.print("Input the number of Leave Entitlement : ");
        leaveEntitlement = input.nextInt();
        do {
            System.out.print("do you want to take a leave: ");
            confirmation = input.next();
            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("how many day: ");
                numLeave = input.nextInt();
                if (numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Reamining leave entitlement: " + leaveEntitlement);
                } else {
                    System.out.println("you dont have enough leave entitlement");
                    break;
                }
            }
        } while (leaveEntitlement > 0);
        input.close();
    }
}
