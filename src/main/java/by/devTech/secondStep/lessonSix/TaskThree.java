package by.devTech.secondStep.lessonSix;

public class TaskThree {

    public static void main(String[] args) {

        int a = -99;
        int b = 299;
        int c = a % 3;
        if (c != 0) a += 3 - c;
        int d = 0;
        for (int i = a; i <= b; i++) d += i;
        System.out.println(d);

    }
}
