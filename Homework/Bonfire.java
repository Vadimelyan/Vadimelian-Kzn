package Homework;

import java.util.Scanner;

public class Bonfire implements Light {
    public void ligth() {
        System.out.println("Костёр горит");
        Scanner scanner=new Scanner(System.in);


        System.out.println("Этот обьект горит?");
        String fire=scanner.next();
        String yes="Да";
        String no="Нет";

        if (fire.equals(yes)){
            System.out.println("Его можно потушить?");


        } String stew=scanner.next();
        if (stew.equals(yes)) {
            System.out.println("Этот обьект можно потушить.");

        }else if (stew.equals(no)){
            System.out.println("Это обьект можно зажечь?");
        }String spark=scanner.next();
        if (spark.equals(yes)){
            System.out.println("Этот обьект можно зажечь.");
        } else {
            System.out.println("Этот обьект нельзя зажечь.");
        }



    }





    }

