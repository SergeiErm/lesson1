package by.devTech.secondStep.lessonFive;

public class TaskNine {

    public static void main(String[] args) {

        int a = 9;
        int b = 5;
        int c = 6;
        int d = 12;
        int e = 32;
        int f = 82;
        int min = Math.min(
                Math.min(a,b),
                Math.min(c,d));
        System.out.println(Math.min(
                Math.min(min,e),
                Math.min(min,f)));
    }
}
