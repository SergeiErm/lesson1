package by.devTech.secondStep.lessonSeven;

import java.util.Random;

public class Task3 {

    public static void main(String[] args) {

        int nums[] = new int[55];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(4) + 11;
            if (nums[i] % 2 == 0) {
                System.out.println(nums[i]);
            }
        }
    }
}
