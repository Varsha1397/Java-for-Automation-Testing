package ClassObject;

public class Demo002dog {

    public static void main(String[] args) {

//  German Shepherd object
        Dog dog1 = new Dog();
        dog1.name = "Rocky";
        dog1.age = 3;
        dog1.breed = "German Shepherd";
        dog1.color = "Brown & Black";

        //  Labrador object
        Dog dog2 = new Dog();
        dog2.name = "Buddy";
        dog2.age = 2;
        dog2.breed = "Labrador";
        dog2.color = "Cream";

        // Show details of both dogs
        dog1.showDetails();
        dog2.showDetails();

        // Dogs barking
        dog1.bark();
        dog2.bark();
    }
}





class Dog {
    String name;
    int age;
    String breed;
    String color;

    void bark() {
        System.out.println(name + " says: Woof Woof!");
    }

    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
        System.out.println("-----------------------");
    }
}





