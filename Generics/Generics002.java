package Generics;

import javax.imageio.stream.ImageInputStream;

public class Generics002 {

//max of 3
    //methods

    public static <DT extends Comparable<DT>> DT maximumOf(DT a, DT b, DT c) {
        //DT customer class created
        //Comparable - int, double, string x -

        DT max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maximumOf(34,54,76));
        System.out.println(maximumOf(4.3,3.4,1.6));
        System.out.println(maximumOf('p','q','z'));
    }


    }


