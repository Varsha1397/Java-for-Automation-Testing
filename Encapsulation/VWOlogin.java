package Encapsulation;

import DEC24.Conditions.IF1;

public class VWOlogin {
    public static void main(String[] args) {
        VWOloginClass vwOloginClass = new VWOloginClass("heyadmin","varsha");
        // vwOloginClass.password // its shows error not anyone ble to change
        vwOloginClass.setPassword("admin"); //can change by using getter & shetters


        String u = vwOloginClass.getUsername();
        System.out.println(u);
         boolean isLoggedIn = vwOloginClass.isLoggedIn("admin","varsha");
        System.out.println(isLoggedIn);

    }


}

class VWOloginClass {

    private String username; //hide this in encapsulation
   private String password; //hide this in encapsulation

    //want to change id and password use getter and setters
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) { //use instead of password 12345667 no hacker will know and set in uper set also
        this.password = password;
    }

    VWOloginClass(String u, String p) {
        this.username = u;
        this.password = p;
    }

    boolean isLoggedIn(String username, String password) {
        if (this.username.toLowerCase().equals(username)
                && this.password.equals(password)) {
            System.out.println("Yes you are a valid username");

        return true;
    }  else {
            System.out.println("Wrong Use");
            return false;
        }
    }
}

