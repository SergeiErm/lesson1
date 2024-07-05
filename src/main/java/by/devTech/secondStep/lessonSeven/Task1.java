package by.devTech.secondStep.lessonSeven;

public class Task1 {

    public static void main(String[] args) {

        int[] nums = new int[20];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ((int)(Math.random()*959) + 11);
            System.out.println(nums[i]);
        }
    }
}


