package by.devTech.secondStep.lessonSix;

public class TaskSix {

    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++)
        {
            int a = i / 100;
            int b = (i / 10) % 10;
            int c = i % 10;
            if (a + b + c == 9)
                System.out.println(i);
        }
    }
}