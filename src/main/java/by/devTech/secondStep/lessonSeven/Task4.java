package by.devTech.secondStep.lessonSeven;

import java.util.Random;

public class Task4 {

    public static void main(String[] args) {

        int result = 0;
        int nums[] = new int[30];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            nums[i] = random.nextInt(30) + 1;
        }
        for (int i = 0; i < nums.length; i+=3) {
            result += nums[i];
        }
        System.out.println(result);
    }
}
