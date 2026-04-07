package Array;

public class Array004 {
    public static void main(String[] args) {

        //1. Creating 2-D Array
        int arr[][] = new int[3][3];

        // 2 Accessing Elements of 2-D
        for (int i=0; i<arr.length; i++){
            for (int j=0; j < arr.length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println("");
        }
        //3. Initializing in  Array /row 1
        arr[0] [0]=11;
        arr[0] [1]=12;
        arr[0] [2]=13;
        //4. Initializing in  Array /row 2
        arr[1] [0]=21;
        arr[1] [1]=22;
        arr[1] [2]=23;
        // 5.Initializing in  Array /row 3
        arr[2] [0]=31;
        arr[2] [1]=32;
        arr[2] [2]=33;

        // 6.Accessing Elements of 2-D
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t"); // Use print, not println
            }
            System.out.println(); // Move to the next row after each inner loop
        }








    }



}

