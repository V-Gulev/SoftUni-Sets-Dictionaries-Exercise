package SoftUni;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class ProductShop_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, LinkedHashMap<String, Double>> shops = new TreeMap<>();
        String input = sc.nextLine();
        while (!input.equals("Revision")) {
            String[] splitInput = input.split(", ");
            String shop = splitInput[0];
            String product = splitInput[1];
            double price = Double.parseDouble(splitInput[2]);
            shops.putIfAbsent(shop, new LinkedHashMap<>());
            shops.get(shop).put(product, price);

            input = sc.nextLine();
        }


        for (Map.Entry<String, LinkedHashMap<String, Double>> entry : shops.entrySet()) {
            System.out.printf("%s->\n", entry.getKey());
            for (Map.Entry<String, Double> product : entry.getValue().entrySet()) {
                System.out.printf("Product: %s, Price: %.1f\n", product.getKey(), product.getValue());
            }
        }
    }
}
