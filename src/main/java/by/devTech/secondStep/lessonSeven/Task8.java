package by.devTech.secondStep.lessonSeven;

public class Task8 {

    public static void main(String[] args) {

        int[][] matrix = new int[10][10];

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = i * 10 + j + 1;
            }
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
            System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
