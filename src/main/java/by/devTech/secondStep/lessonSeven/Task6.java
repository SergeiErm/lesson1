package by.devTech.secondStep.lessonSeven;

import java.util.Random;

public class Task6 {

    public static void main(String[] args) {

        int n = 10;
        int[] nums = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            nums[i] = random.nextInt(90) + 11; // Генерация случайного числа от 11 до 100
        }

        for (int j : nums) {
            System.out.println(j + " ");
        }

        System.out.println("Последний элемент массива: " + nums[n - 1]);
    }
}

