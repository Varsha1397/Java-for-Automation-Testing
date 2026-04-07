package Acessmodifier.criminal;

import Acessmodifier.police.Cop;

public class Thief {
    public static void main(String[] args) {


        Cop c = new Cop(90); //use directly without extends
        int bullets = c.getGun();
        System.out.println(bullets);

       // c.canIsShoot(); // not able to use bcz of protected used in cop


    }
}
//public
//protected
//private
//defualt not allot means public