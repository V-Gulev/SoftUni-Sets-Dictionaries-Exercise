package SoftUni;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsOfElements_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> setN = new LinkedHashSet<>();
        Set<Integer> setM = new LinkedHashSet<>();
        String[] sizes = sc.nextLine().split("\\s+");
        fillSet(sizes[0], sc, setN);
        fillSet(sizes[1], sc, setM);

        setN.retainAll(setM);

        setN.forEach(n -> System.out.print(n + " "));
    }

    private static void fillSet(String size, Scanner sc, Set<Integer> setN) {
        for (int i = 0; i < Integer.parseInt(size); i++) {
            int number = Integer.parseInt(sc.nextLine());
            setN.add(number);
        }
    }
}
