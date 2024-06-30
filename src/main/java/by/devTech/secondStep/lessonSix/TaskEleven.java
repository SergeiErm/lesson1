package by.devTech.secondStep.lessonSix;

public class TaskEleven {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 20; i < 999; i++) {
            if (i % 2 == 0){
                sum += i;
            }
        }  System.out.println(sum);
    }
}
