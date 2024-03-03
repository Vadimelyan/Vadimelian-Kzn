package Homework;

import java.util.Scanner;

public class LightBulb implements Light {
    public static void ligth() {
        Scanner scanner=new Scanner(System.in);
        String color=new String();
        String fire=scanner.next();
        String yes="Да";
        String no="Нет";


        if (fire.equals(yes)){
            System.out.println("Лампочка горит");

        }else if (fire.equals(no)){
            System.out.println("обьект не горит");
        }
        System.out.println("Обьект включен?");
        String on=scanner.next();
        if (on.equals(yes)) {
            System.out.println("Каким цыетом горит лампа: ");
            color= scanner.next();
            System.out.println("Лампа горит "+color+" цветом.");
        }else if (on.equals(no)) {
            System.out.println("Обьект выключен");
        }
    }
}
