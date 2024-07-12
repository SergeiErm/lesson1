package by.devTech.secondStep.lessonSeven;

import java.util.Random;

public class Task2 {

    public static void main(String[] args) {

        int[] nums = new int[55];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (random.nextInt(959) + 11);
        }
        for (int i = 0; i < nums.length; i += 2) {
            System.out.println("элемент с четным номером " + i + ": " + nums[i]);
        }
    }
}

