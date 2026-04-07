package String;

public class String006 {
    public static void main(String[] args) {

        String[] numbers = {"88", "91.2" , "34.12"};
        String max = findlargestelement(numbers);

        System.out.println("the largest element is displayed as:" +max);

    }
public static String findlargestelement(String[] arr) {
    String max = "";
    for (int i = 0; i < arr.length; i++) {
        if (arr[i].compareTo(max) > 0)
        {
            max = arr[i];
        }
    }
    return max;
}

}
