package by.devTech.secondStep.lessonSix;

public class TaskEight {

    public static void main(String[] args) {

        int a = 1;
        int b = 5;
        int result = 0;

        while (a < 10) {
            result += b;
            System.out.println(a + " итерация: " + result);
            a++;
        }
    }
}
