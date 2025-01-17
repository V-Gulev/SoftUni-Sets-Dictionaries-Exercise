package SoftUni;

import java.util.*;

public class CitiesByContinentAndCountry_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String, LinkedHashMap<String, LinkedHashSet<String>>> world = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().trim().split("\\s+");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            world.putIfAbsent(continent, new LinkedHashMap<>());
            world.get(continent).putIfAbsent(country, new LinkedHashSet<>());
            world.get(continent).get(country).add(city);
        }

        for (Map.Entry<String, LinkedHashMap<String, LinkedHashSet<String>>> entry : world.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Map.Entry<String, LinkedHashSet<String>> country : entry.getValue().entrySet()) {
                System.out.println("  " + country.getKey() + " -> " + String.join(", ", country.getValue()));
            }
        }
    }
}
