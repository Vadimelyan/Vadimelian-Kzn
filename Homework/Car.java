package Homework;
//Задание 2
//Создать класс «Сar», у которого будут два свойства и два метода (например, разогнаться и остановиться).
//Используя наследованные, реализовать класс «Грузовой автомобиль» и «Легковой автомобиль».
//В унаследованных классах добавь по одному свойству и одному методу.
public class Car {
    int weigh;
    double power;

    public Car(int weigh, int power) {
        this.weigh = weigh;
        this.power = power;
    }

    public void Accelerate(){
        System.out.println("Разгон до 100км.ч за: "+0.07*this.power);
    }
    public void stop(){
        double mas=this.weigh/this.power;
        System.out.println("Остановка(сек)"+mas+" секунд");
    }
}
