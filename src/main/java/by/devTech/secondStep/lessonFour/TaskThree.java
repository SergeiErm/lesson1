package by.devTech.secondStep.lessonFour;

public class TaskThree {

    public static void main(String[] args) {

        int a = 12;
        int b = 13;
        int c = 19;
        int d = -7;
        if (a >= b)
        {
            System.out.println(a + " больше " + b);
        }
        else if (a >= c)
        {
            System.out.println(a + " больше " + c);
        }
        else if (a >= d)
        {
            System.out.println(a + " больше " + d);
        }
        if (b >= a)
        {
            System.out.println(b + " больше " + a);
        }
        else if (b >= c)
        {
            System.out.print(b + " больше " + c);
        }
        else if (b >= d)
        {
            System.out.println(b + " больше " + d);
        }
        if (c >= a)
        {
            System.out.println(c + " больше " + a);
        }
        else if (c >= b)
        {
            System.out.println(c + " больше " + b);
        }
        else if (c >= d)
        {
            System.out.println(c + " больше " + d);
        }
        if (d >= a)
        {
            System.out.println(d + " больше " + a);
        }
        else if (d >= b)
        {
            System.out.println(d + " больше " + b);
        }
        else if (d >= c)
        {
            System.out.println(d + " больше " + c);
        }
        else
        {
            System.out.println(d + " меньше " + a + ", " + c + ", " +  b);
        }
    }
}


