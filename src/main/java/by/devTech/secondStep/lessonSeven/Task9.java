package by.devTech.secondStep.lessonSeven;

public class Task9 {

    public static void main(String[] args) {

        int[][] nums = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                nums[i][j] = i * 10 + j + 1;
            }
        }
        for (int j = 0; j < 10; j += 2) {
            for (int i = 0; i < 10; i++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
    }
}

