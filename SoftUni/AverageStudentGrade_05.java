package SoftUni;

import java.util.*;

public class AverageStudentGrade_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Double>> students = new TreeMap<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String[] elements = sc.nextLine().split("\\s+");
            String name = elements[0];
            double grade = Double.parseDouble(elements[1]);
            students.putIfAbsent(name, new ArrayList<>());
            List<Double> grades = students.get(name);
            grades.add(grade);
        }

        students.forEach((k, v) -> {
            System.out.print(k + " -> ");
            v.forEach(grade -> System.out.printf("%.2f ", grade));
            System.out.printf("(avg: %.2f)\n", getAverageGrade(v));
        });
    }

    private static double getAverageGrade(List<Double> grades) {
        double sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }
}

