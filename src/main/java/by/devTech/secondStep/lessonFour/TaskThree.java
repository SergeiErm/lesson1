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
        if ((a <= b) | (a <= c) | (a <= d))
        {
            System.out.println(12 + " меньше");
        }
        else{
            System.out.print(12 + " больше");
        }
        if ((b <= a) | (b <= c) | (b <= d))
        {
            System.out.println(13 + " меньше");
        }
        else{
            System.out.println(13 + " больше");
        }
        if ((c <= a) | (c <= b) | (c <= d))
        {
            System.out.println(19 + " меньше");
        }
        else{
            System.out.println(19 + " больше");
        }
        if ((d <= a) | (d <= b) | (d <= c))
        {
            System.out.println(-7 + " меньше");
        }
        else{
            System.out.println(-7 + " больше");
        }
    }
}
