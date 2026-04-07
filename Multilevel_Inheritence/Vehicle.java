package Multilevel_Inheritence;

public class Vehicle {

//vehicle -> Car -> Tesla
// multi level -g -f -s

    int seats;
    String engineType;
    int speed;

    Vehicle(int speed){
        this.speed = speed;

    }
    void topSpeed(){
        System.out.println("Top speed is " + this.speed);
    }








}
