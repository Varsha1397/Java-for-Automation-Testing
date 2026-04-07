package Throws;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Throws001 {
    public static void main(String[] args) throws IOException {

        readfile("C://a.txt");
    }


    static void readfile(String filename) throws IOException{
        File file = new File(filename);
        FileReader r = new FileReader(file);
        if (file.length()== 0)
            throw new FileNotFoundException("Exception");
    }
  }

  //in throws we discuss in full function exception
// in throw we meer some specific condition
// we can use sath mein both throw and throws