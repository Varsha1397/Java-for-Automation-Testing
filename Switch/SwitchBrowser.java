package Switch;

import java.util.Locale;
import java.util.Scanner;

public class SwitchBrowser {
    public static void main(String[] args) {

        //Scanner
        System.out.println("Enter Your Browser\n");

        Scanner scanner =new Scanner(System.in);
        String browser;
        browser = scanner.next();
        browser = browser.toLowerCase(Locale.ROOT); //<-- IMPORTANT thing for enter upper lower case characters

        switch (browser){
            case "chrome":
                System.out.println("chrome started!!");
                break;
            case "firefox":
                System.out.println("firefox started!!");
                break;
            default:
                System.out.println("default started");

        }






    }
}
