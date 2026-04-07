package DEC24.Conditions;

import javax.management.MBeanAttributeInfo;
import java.util.Scanner;

public class IF03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a,b,c\n");  //CHECK WHICH ONE is big

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

//
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);


        if (a > b && a > c) {
        System.out.println(a);
    }
        else if (b > a && b>c){

            System.out.println(b);
        }else{
            System.out.println(c);
        }

        sc.close();

    }
}
