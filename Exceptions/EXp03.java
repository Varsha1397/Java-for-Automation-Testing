package Exceptions;

import java.io.File;
import java.io.FileReader;

public class EXp03 {
    public static void main(String[] args) {
        String path = "C://a.text" ;
        File file = new File(path);
       // FileReader fileReader = new FileReader(file); //checked exception
                                                           //exception at compile time --jvm knows about it

    }



}
