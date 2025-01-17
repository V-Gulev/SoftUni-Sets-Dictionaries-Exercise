package SoftUni;

import java.util.*;

public class CitiesByContinentAndCountry_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        LinkedHashMap<String, LinkedHashMap<String, ArrayList<String>>> world = new LinkedHashMap<>();

        while (n-- > 0){
            String[] input = sc.nextLine().trim().split("\\s+");
            String continent = input[0];
            String country = input[1];
            String city = input[2];

            if (!world.containsKey(continent)) {
                world.put(continent, new LinkedHashMap<>() {{put(country, new ArrayList<>(){{add(city);}});}});
            } else {
                if (!world.get(continent).containsKey(country)) {
                    world.get(continent).put(country, new ArrayList<>(){{add(city);}});
                } else {
                    world.get(continent).get(country).add(city);
                }
            }
        }

        for (Map.Entry<String, LinkedHashMap<String, ArrayList<String>>> entry : world.entrySet()) {
            System.out.println(entry.getKey() + ":");
            for (Map.Entry<String, ArrayList<String>> country : entry.getValue().entrySet()) {
                System.out.println("  " + country.getKey() + " -> " + String.join(", ", country.getValue()));
            }
        }
    }
}

