package SoftUni;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Set<String> elements = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            elements.addAll(Arrays.asList(sc.nextLine().split("\\s+")));
        }

        elements.forEach(s -> System.out.print(s + " "));
    }
}
