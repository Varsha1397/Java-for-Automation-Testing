package DEC24.Conditions;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        //take an input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number , I will tell you Odd or Even\n");

        int a = sc.nextInt();

        if (a % 2 == 1)

            System.out.println("ODD Number");      //many ifs allowed if (a % 2 == 0)
        else {
                System.out.println("Even Number");
            }
        }
    }


