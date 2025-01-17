package SoftUni;

import java.util.*;

public class AcademyGraduation_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        TreeMap<String, double[]> students = new TreeMap<>();


        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            double[] grades = Arrays.stream(sc.nextLine().split("\\s+")).mapToDouble(Double::parseDouble).toArray();

            students.put(name, grades);
        }

        for (Map.Entry<String, double[]> entry : students.entrySet()) {
            double average = getAverage(entry.getValue());
            System.out.printf("%s is graduated with %s\n", entry.getKey(), average);

        }


    }
    private static double getAverage(double[] array) {
        double average = 0;
        double sum = 0;

        for (double grade : array) {
            sum += grade;
        }
        average = sum / array.length;

        return average;
    }
}

