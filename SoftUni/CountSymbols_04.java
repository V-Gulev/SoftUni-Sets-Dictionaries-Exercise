package SoftUni;

import java.util.*;

public class CountSymbols_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> symbols = new TreeMap<>();
        String text = sc.nextLine();
        for (char c : text.toCharArray()) {
            symbols.putIfAbsent(c, 0);
            symbols.put(c, symbols.get(c) + 1);
        }

        for (Map.Entry<Character, Integer> entry : symbols.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s");
        }
    }
}
