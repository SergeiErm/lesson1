package by.devTech.secondStep.lessonSeven;

public class Task10 {

    public static void main(String[] args) {

        int[][] nums = new int[30][30];
        int sum = 0;

        for (int i = 0; i < 30; i++) {
            nums[i][i] = i + 1;
            sum += nums[i][i];
        }
        System.out.println(sum);
    }
}

