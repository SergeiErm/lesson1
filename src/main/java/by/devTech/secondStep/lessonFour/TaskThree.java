package by.devTech.secondStep.lessonFour;

public class TaskThree {
    public static void main(String[] args) {

        int a = 12;
        int b = 13;
        int c = 19;
        int d = -7;
        int max = a;
        if (max <= b){
            max = b;
        }
        if (max <= c){
            max = c;
        }
        if (max <= d){
            max = d;
        }
        System.out.println(max + " больше");
    }
}