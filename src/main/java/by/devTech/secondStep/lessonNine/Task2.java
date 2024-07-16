package by.devTech.secondStep.lessonNine;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        String[] names = new String[10];
        for(int i = 0; i < names.length; i++){
            System.out.println("Введите имя: " + (i + 1) + ": ");
            names[i] = scan.nextLine();
        }
        System.out.println("Введенные имена: ");
        for (String name : names){
            System.out.println(name);
        }
    }
}
