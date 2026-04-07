package Exception2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionChecked {
    public static void main(String[] args) {
        String path = "C://a.text" ;
        File file = new File(path);
       try {
            FileReader fileReader = new FileReader(file);
        }catch (FileNotFoundException e) {
           e.printStackTrace();
       }finally {
           System.out.println("find the path");
       }
    }




}
