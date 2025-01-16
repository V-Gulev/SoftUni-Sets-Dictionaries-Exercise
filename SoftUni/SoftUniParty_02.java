package SoftUni;

import java.util.*;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Set<String> vip = new TreeSet<>();
        Set<String> regular = new TreeSet<>();
        while (!input.equals("PARTY")) {

            if (Character.isDigit(input.charAt(0))) {
                vip.add(input);
            } else regular.add(input);


            input = sc.nextLine();
        }

        while (!input.equals("END")) {
            vip.remove(input);
            regular.remove(input);

            input = sc.nextLine();
        }
        System.out.println(vip.size() + regular.size());
        vip.forEach(System.out::println);
        regular.forEach(System.out::println);
    }
}
