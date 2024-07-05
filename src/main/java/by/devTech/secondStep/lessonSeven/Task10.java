package by.devTech.secondStep.lessonSeven;

public class Task10 {

    public static void main(String[] args) {

        int[][] nums = new int[30][30];
        int sum = 0;

        for (int i = 0; i < 30; i++) {
            for (int j = 0; j < 30; j++) {
                nums[i][j] = i + j;
                if (i == j) {
                    sum += nums[i][j];
                }
            }
        }

        System.out.println(sum);
    }
}

