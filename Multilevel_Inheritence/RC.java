package Multilevel_Inheritence;

public class RC {
    public static void main(String[] args) {

        Tesla t = new Tesla(300);
        t.topSpeed();  //run local one own

       Car c = new Car(200);
       c.topSpeed();


       Vehicle v = new Vehicle(150);
       v.topSpeed();
    }


}
