package SoftUni;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, String> phonebook = new HashMap<>();
        while (!input.equals("search")) {
            String[] elements = input.split("-");
            String name = elements[0];
            String number = elements[1];
            phonebook.put(name, number);

            input = sc.nextLine();
        }

        input = sc.nextLine();
        while (!input.equals("stop")) {
            if (phonebook.containsKey(input)) {
                System.out.printf("%s -> %s\n", input, phonebook.get(input));
            } else {
                System.out.printf("Contact %s does not exist.\n", input);
            }
            input = sc.nextLine();
        }
    }
}
