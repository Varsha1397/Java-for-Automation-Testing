package Interface;

public class mainclass {
    public static void main(String[] args) {

        //I1 i = new I1(); not able to create interface
       Internal i = new Internal();
       i.driver();  // user know this  & doesnot know internal classes how engine tyre run

//down there hidden from the user by using interface and abstarction
    }

}
interface CAr{

  abstract void engine();
   abstract void tyres();
}

class  Internal implements CAr{  // in interface we implement not extends
    void driver(){
    engine();
    tyres();
    }

    @Override
    public void engine() {
        System.out.println("Engine is started");
    }

    @Override
    public void tyres() {
        System.out.println("Tyres are running");
    }
}