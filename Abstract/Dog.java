package Abstract;

public class Dog extends Animal{

// by generate overide animals is compete by dog
    @Override
    void say() {
        System.out.println("Dog");
    }

    @Override
    void say2() {

    }

    @Override
    void fly() {
        System.out.println("yes can fly on plane");
    }
}
