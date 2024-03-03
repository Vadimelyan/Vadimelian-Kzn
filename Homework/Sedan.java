package Homework;

import java.util.Scanner;

public class Sedan extends Car{
    String color;
    public Sedan(int weigh, int power) {
        super(weigh, power);
        this.color=color;
    }
    public void choice(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Введите цвет");
        String colorName= scanner.next();
        System.out.println("Характеристики:"+"\n"+"Вес: "+weigh+" Мощность: "+power+" Цвет: "+colorName);

    }

    public static void main(String[] args) {
        Sedan bmv=new Sedan(900,500);
        bmv.Accelerate();
        bmv.stop();
        bmv.choice();
    }
}
