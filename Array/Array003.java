package Array;

public class Array003 {
    public static void main(String[] args) {

        //print the main diagonal of n * n matrix
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i =0; i < mat.length; i++) {
            for (int j=0; j < mat[i].length; j++) {
                if (i == j)
                    System.out.println(mat[i][j] + "\t");
            }
        }
    }

}
