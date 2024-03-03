package Homework;
//Задание 4
//Класс Person
//
//Создать класс Person, который содержит:
//1) переменные fullName, age;
//2) методы move() и talk(), в которых просто вывести на консоль сообщение -"Такой-то  Person говорит" и "Такой-то  Person двигается".
//3) Добавьте два конструктора  - Person() и Person(fullName, age).
//4) Создайте два объекта этого класса. Один объект инициализируется конструктором Person(), другой - Person(fullName, age).
//5) Вызовите методы move() и talk().
public class Person {
    String fullName;
    int age;

    public void move(){
        System.out.println("Такой то "+ fullName+" говорит");
    }
    public void  talk(){
        System.out.println("Такой то "+ fullName +" двигается");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    public static void main(String[] args) {
        Person vasya=new Person("Вася",36);
        Person sasha=new Person("Саша",25);
        vasya.move();
        vasya.talk();
        sasha.move();
        sasha.talk();

    }
}
