package Polymorphism.MethodOverloading;

public class Person {

void Speak(byte x) {
    System.out.println(x + "is a byte "); }
    int Speak(int x){
        System.out.println(x + "is an int");
        return 0;
    }

void Speak(float x) {
    System.out.println(x + "is a float");
}
    void Speak(double x){
        System.out.println(x + "is a double");
}

    void Speak(char x){
        System.out.println(x + "is a char");
    }


    void Speak(String s, char x){
        System.out.println(x + "Multiple Params");
    }
}

/// function name speak same only functionality / parameters  change