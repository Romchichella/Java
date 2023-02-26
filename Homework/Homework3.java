package Homework;
   

//     import java.util.ArrayList;
// import java.util.List;

// // 1. Пусть дан произвольный список целых чисел, удалить из него четные числа (в языке уже есть что-то готовое для этого)

// public class Homework3 {
//     public static void main(String[] args) {
//         List<Integer> numbers = new ArrayList<>(List.of(5, 34, 8, 86));
//         numbers.removeIf(n -> n % 2 == 0);
//         System.out.println(numbers);
//     }
// }


// // 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее арифметическое из этого списка.

import java.util.ArrayList;
import java.util.Collections;

public class Homework3 {
    public static void main(String[] args) {
        // Создаем список чисел
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(6);
        numbers.add(8);
        numbers.add(11);
        numbers.add(24);
        numbers.add(76);
        numbers.add(87);

        // Находим минимальное число в списке
        int min = Collections.min(numbers);
        System.out.println("Минимальное число: " + min);

        // Находим максимальное число в списке
        int max = Collections.max(numbers);
        System.out.println("Максимальное число: " + max);

        // Находим среднее арифметическое значение в списке
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        double average = (double) sum / numbers.size();
        System.out.println("Среднее арифметическое: " + average);
    }
}