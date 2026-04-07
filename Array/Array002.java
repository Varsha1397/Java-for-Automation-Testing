package Array;

public class Array002 {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5}; //2d array - arr1 and arr2 numbers are same but locations are different for both
        int[] arr2 = {1,2,3,4,5};
        int[] arr3 = arr1;    // here declares arr1 equals to arr3
        System.out.println(arr1==arr2);
        System.out.println(arr1==arr3);
        System.out.println(arr2==arr3);

        //whenever new array created without assign value jvm automatically assign value = 0

        int [] a = new int[5]; //REFERENCE VARIABLE
        a[0] =1;
        a[1] =2;
       // a[2]= 3;
        a[3]= 4;
        a[4]= 5;
        System.out.println(a[2]);
    }
}
