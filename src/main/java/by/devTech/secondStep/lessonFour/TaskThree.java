package by.devTech.secondStep.lessonFour;

public class TaskThree {

    public static void main(String[] args) {

        int a = 12;
        int b = 13;
        int c = 19;
        int d = -7;
        boolean e = (a <= b) | (a <= c) | (a <= d);
        boolean f = (b <= a) | (b <= c) | (b <= d);
        boolean g = (c <= a) | (c <= b) | (c <= d);
        boolean h = (d <= a) | (d <= b) | (d <= c);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);


    }
}
