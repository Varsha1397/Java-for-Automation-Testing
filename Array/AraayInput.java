package Array;

import java.util.Scanner;

public class AraayInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[3];   // limitation size is 3
        System.out.println("Enter your marks for sub 1");
        array[0] = sc.nextInt();
        System.out.println("Enter your marks for sub 2");
        array[1]  = sc.nextInt();
        System.out.println("Enter your marks for sub 3");
        array[2] = sc.nextInt();
        System.out.println("Your Marks are " + array[0] + " - " +array[1]+ " - " +array[2]);
    }
}

//assignment = how many subject? = n
//array with size n
// print all the n subjects number


//n , while i <=n , print array [i]