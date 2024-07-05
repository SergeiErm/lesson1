package by.devTech.secondStep.lessonSeven;

import java.util.Random;

public class Task5 {

    public static void main(String[] args) {

        int min;
        int max;
        int nums[] = new int[100];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(959) + 11;
        }
        min = nums[0];
        max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];
            }
            System.out.println(min + " миниальное");
            System.out.println(max + " максимальное");
        }
    }
}


