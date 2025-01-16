package SoftUni;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Set<String> parking = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String[] splitInput = input.split(", ");
            String directions = splitInput[0];
            String carNumber = splitInput[1];

            switch (directions) {
                case "IN":
                    parking.add(carNumber);
                    break;
                case "OUT":
                    parking.remove(carNumber);
                    break;
            }


            input = sc.nextLine();
        }
        if (parking.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (String carNumber : parking) {
                System.out.println(carNumber);
            }
        }


    }
}
