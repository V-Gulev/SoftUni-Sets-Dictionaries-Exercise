package SoftUni;

import java.util.*;
import java.util.stream.Collectors;

public class Voina_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> player1Set = new LinkedHashSet<>(Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toSet()));
        Set<Integer> player2Set = new LinkedHashSet<>(Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toSet()));
        LinkedList<Integer> player1 = new LinkedList<>(player1Set);
        LinkedList<Integer> player2 = new LinkedList<>(player2Set);
        int rounds = 0;

        while (!player1.isEmpty() && !player2.isEmpty() && rounds <= 50) {
            rounds++;
            int card1 = player1.poll();
            int card2 = player2.poll();

            if (card1 > card2) {
                player1.add(card1);
                player1.add(card2);
            } else if (card2 > card1) {
                player2.add(card1);
                player2.add(card2);
            }
        }


        if (player1.isEmpty()) {
            System.out.println("Second player win!");
        } else if (player2.isEmpty()) {
            System.out.println("First player win!");
        } else {
            System.out.println("Draw!");
        }
    }
}