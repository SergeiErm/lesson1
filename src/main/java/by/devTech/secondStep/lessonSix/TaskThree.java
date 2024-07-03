package by.devTech.secondStep.lessonSix;

public class TaskThree {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = -99; i <= 299; i++) {
            if (i % 3 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
