package by.devTech.secondStep.lessonThree;

public class TaskEleven {

    public static void main(String[] args) {

        double degrees1 = 30.0;
        double radians1 = Math.toRadians(degrees1);
        System.out.format("Синус %.1f равен градусов %.4f%n", degrees1, Math.sin(radians1));
        System.out.format("Косинус %.1f равен градусов %.4f%n", degrees1, Math.cos(radians1));
        System.out.format("Тангенс %.1f равен градусов %.4f%n", degrees1, Math.tan(radians1));



    }
}
