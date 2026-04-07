package single_inheritence;

public class Python extends Programming{
    String newFeature;

    Python(int version, String author,String nf){
        super(version, author);
        this.newFeature = nf;

    }


    void printPython(){
        this.printInfo();
        System.out.println(this.newFeature);
    }

}
