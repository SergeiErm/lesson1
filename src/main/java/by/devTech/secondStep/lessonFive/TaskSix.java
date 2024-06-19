package by.devTech.secondStep.lessonFive;

public class TaskSix {

    public static void main(String[] args) {

        int a = 49;
        int b = a / 10 + a % 10;
        if (b % 2 == 0){
         System.out.println(b + 2);
        }
        else{
            System.out.println(b - 2);
        }
    }
}
