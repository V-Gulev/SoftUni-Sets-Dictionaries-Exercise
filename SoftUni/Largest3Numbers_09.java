package SoftUni;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Largest3Numbers_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt)
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .forEach(integer -> System.out.print(integer + " "));

    }
}
