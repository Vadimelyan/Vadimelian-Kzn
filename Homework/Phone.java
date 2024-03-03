package Homework;

import java.util.Scanner;

//Задание 1
//Класс Phone.
//
//        1) Создайте класс Phone, который содержит переменные number, model и weight.
//        2) Создайте три экземпляра этого класса.
//3) Выведите на консоль значения их переменных.
//        4) Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
//        Выводит на консоль сообщение “Звонит {name}”. Метод getNumber – возвращает номер телефона.
//        Вызвать эти методы для каждого из объектов.
//5) Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
// переменных класса - number, model и weight.
//6) Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса -
// number, model.
//7) Добавить конструктор без параметров.
public class Phone {

    int number;
    String model;
    int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    public static void main(String[] args) {


        Phone sony = new Phone(2465, "Sony", 140);
        Phone samsung = new Phone(3912, "Samsung", 150);
        Phone xiaomi = new Phone(8017, "Xiaomi", 210);


        System.out.println("Номер:" + sony.number + " Модель:" + sony.model + " Вес:" + sony.weight);
        System.out.println("Номер:" + samsung.number + " Модель:" + samsung.model + " Вес:" + samsung.weight);
        System.out.println("Номер:" + xiaomi.number + " Модель:" + xiaomi.model + " Вес:" + xiaomi.weight);
        System.out.println(sony.getNumber());
        System.out.println(samsung.getNumber());
        System.out.println(xiaomi.getNumber());
        System.out.println(xiaomi.receiveCall());
       

    }

    public int getNumber() {
        return number;

    }

    public static String receiveCall(){

        Scanner scanner=new Scanner(System.in);
        String callersname = scanner.toString();
        System.out.println("Звонит "+callersname);



        return callersname;// не понимаю как вывести без ошибки тут?
    }

}














