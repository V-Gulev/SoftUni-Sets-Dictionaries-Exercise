package SoftUni;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] realNumbers = Arrays.stream(sc.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();
        Map<Double, Integer> map = new LinkedHashMap<>();
        for (double realNumber : realNumbers) {
            if (map.containsKey(realNumber)) {
                Integer currentValue = map.get(realNumber);
                map.put(realNumber, currentValue + 1);
            } else {
                map.put(realNumber, 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
            System.out.printf("%.1f -> %d\n", entry.getKey(), entry.getValue());
        }

    }
}
