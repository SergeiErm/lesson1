package by.devTech.secondStep.lessonSeven;

public class Task12 {

    public static void main(String[] args) {

        int[][] nums = new int[10][10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                nums[i][j] = i * 10 + j;
                sum += nums[i][j];
            }
        }
        System.out.println(sum);
    }
}