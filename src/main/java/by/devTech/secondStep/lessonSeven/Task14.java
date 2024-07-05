package by.devTech.secondStep.lessonSeven;

public class Task14 {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, -2, 3},
                {-4, 5, -6},
                {7, -8, 9}
        };

        int a = matrix.length;

        for (int i = 0; i < a; i++) {
            if(matrix[i][i] > 0){
                System.out.println(matrix[i][i] + " ");
            }
        }
    }
}
