package by.devTech.secondStep.lessonSeven;

public class Task11 {

    public static void main(String[] args) {

        int[][] nums = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                nums[i][j] = (int) (Math.random() * 100);
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print((j > 9 - i) ? nums[i][j] + " " : " ");
            }
            System.out.println();
        }
    }
}
