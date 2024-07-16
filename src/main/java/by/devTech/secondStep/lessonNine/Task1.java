package by.devTech.secondStep.lessonNine;

import java.util.Scanner;

public class Task1 {

    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);

        int[] arr = new int[10];
        System.out.print("Введите элементы массива: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        System.out.println("Массив: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(" " + arr[i]);
        }
    }
}
