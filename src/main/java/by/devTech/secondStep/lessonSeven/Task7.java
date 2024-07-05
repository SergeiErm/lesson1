package by.devTech.secondStep.lessonSeven;

import java.util.Random;

public class Task7 {

    public static void main(String[] args) {

        int[][] nums = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                nums[i][j] = random.nextInt(100);
            }
        }
        int min = nums[0][0];
        int max = nums[0][0];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (nums[i][j] < min) {
                    min = nums[i][j];
                }
                if (nums[i][j] > max) {
                    max = nums[i][j];
                }
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
    }
}