package Acessmodifier.police;

public class Cop {

    int gun;

   public Cop(int gun) {
        this.gun = gun;
    }

    public int getGun() {
        return gun;
    }
    protected void canIsShoot(){   //while using protected only this  package folder clas can use not other
        System.out.println("yes you can, you are a Police");
    }


}