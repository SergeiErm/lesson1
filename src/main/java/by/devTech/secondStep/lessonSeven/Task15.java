package by.devTech.secondStep.lessonSeven;

import java.util.Random;

public class Task15 {

    public static void main(String[] args) {
        int m = 5;
        int n = 5;
        int[][] matrix = new int[m][n];
        Random random = new Random();

        for (int j = 0; j < n; j++) {
            int ones = j + 1;
            for(int i = 0; i < m; i++) {
                if(ones > 0){
                    matrix[i][j] = 1;
                    ones--;
                }
                else{
                    matrix[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
