package Array;

import java.util.Scanner;

public class ArrayInput2 {

    public static void main(String[] args) {

        //Assignment - 1. How many Subject? =n
        //             2.Array with size n
        //             3. Print all n subjects numbers
        Scanner scanner = new Scanner(System.in);

        // 1. Ask the user how many subjects they have
        System.out.print("Enter the number of subjects: ");
        int n = scanner.nextInt();

        // 2. Create an array with size 'n'
        int[] subjects = new int[n];

        // 3. Input subject numbers into the array
        System.out.println("Enter the subject numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjects[i] = scanner.nextInt();
        }

        // 4. Print all the subject numbers
        System.out.println("The subject numbers are:");
        for (int i = 0; i < n; i++) {
            System.out.println("Subject " + (i + 1) + ": " + subjects[i]);

        }

        scanner.close();
    }
}


