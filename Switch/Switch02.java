package Switch;

public class Switch02 {
    public static void main(String[] args) {
        char ch ='O';
        if (ch>65 && ch<=90){
            switch (ch){
                case'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println("Character is Vowel");
                    break;
                default:
                    System.out.println("Character is Consonant");

            }
        }
    }
}
