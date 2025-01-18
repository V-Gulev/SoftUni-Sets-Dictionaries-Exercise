package SoftUni;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FixEmails_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> people = new LinkedHashMap<>();
        String input = sc.nextLine();

        while (!input.equals("stop")) {
            String email = sc.nextLine();
            if (!email.endsWith("com") && !email.endsWith("uk") && !email.endsWith("us")) {
                people.put(input, email);
            }

            input = sc.nextLine();
        }

        people.forEach((s, s2) -> System.out.printf("%s -> %s\n", s, s2));
    }
}
