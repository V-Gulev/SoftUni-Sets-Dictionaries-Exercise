package SoftUni;

import java.util.*;

public class HandsOfCards_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Set<String>> people = new LinkedHashMap<>();
        String input = sc.nextLine();

        while (!input.equals("JOKER")) {
            String name = input.split(": ")[0];
            String cards = input.split(": ")[1];
            String[] cardsArray = cards.split(", ");
            Set<String> cardsSet = new HashSet<>(Arrays.asList(cardsArray));

            if (!people.containsKey(name)) {
                people.put(name, cardsSet);
            } else {
                Set<String> currentCards = people.get(name);
                currentCards.addAll(cardsSet);
                people.put(name, currentCards);
            }
            input = sc.nextLine();
        }

        people.forEach((name, cards) -> {
            int points = getCardValue(cards);
            System.out.printf("%s: %d%n", name, points);
        });
    }

    private static int getCardValue(Set<String> cards) {
        Map<Character, Integer> symbolsValue = getSymbolValue();
        int sumPoints = 0;
        for (String card : cards) {
            int currentPoints = 0;
            if (card.startsWith("10")) {
                char type = card.charAt(2);
                currentPoints = 10 * symbolsValue.get(type);
            } else {
                char power = card.charAt(0);
                char type = card.charAt(1);
                currentPoints = symbolsValue.get(power) * symbolsValue.get(type);
            }
            sumPoints += currentPoints;
        }
        return sumPoints;
    }

    private static Map<Character, Integer> getSymbolValue() {
        Map<Character, Integer> characterValues = new HashMap<>();
        characterValues.put('2', 2);
        characterValues.put('3', 3);
        characterValues.put('4', 4);
        characterValues.put('5', 5);
        characterValues.put('6', 6);
        characterValues.put('7', 7);
        characterValues.put('8', 8);
        characterValues.put('9', 9);
        characterValues.put('J', 11);
        characterValues.put('Q', 12);
        characterValues.put('K', 13);
        characterValues.put('A', 14);
        characterValues.put('S', 4);
        characterValues.put('H', 3);
        characterValues.put('D', 2);
        characterValues.put('C', 1);
        return characterValues;
    }
}