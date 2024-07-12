package by.devTech.secondStep.lessonSeven;

import java.util.Random;

public class Task12 {

    public static void main(String[] args) {

        int[][] nums = new int[10][10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                nums[i][j] = random.nextInt(10);
            }
        }
        int sum = 0;
        for (int i = 1; i < 10; i += 2) {
            for (int j = 0; j < 10; j++) {
                sum += nums[i][j];
            }
        }
        System.out.println(sum);
    }
}