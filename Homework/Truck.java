package Homework;

public class Truck extends Car{

    int length;
    public Truck(int weigh, int power) {
        super(weigh, power);
        this.length=length;
    }
    public  void turn(){
        double r=(length/3.14)*(power*0.5);
        System.out.println("Разворот: "+r);
    }

    public static void main(String[] args) {
        Truck volvo=new Truck(1500,700);
        volvo.length=9;
        volvo.turn();
        volvo.stop();
        volvo.Accelerate();
    }
}

