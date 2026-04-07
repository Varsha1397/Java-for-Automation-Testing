package InnerClasses;

public class Car {

    String make;

    public Car(String make) {
        this.make = make;
    }

    void drive(){
        System.out.println("i can drive");
        new Engine ("400");//.start();
    }

    class Engine{
        String hoursePower;
        public  Engine (String hoursePower){
        this.hoursePower = hoursePower;
    }
    }
        void start(){
        System.out.println("I am start the engine" + make);
    }

}
// class engine is secure hide the other things
// class hidden in with the class
