public class Main {
    public static void main(String[] args) {

        Exercice2 ex = new Exercice2();
        Paire testPetit = new Paire(80, 80.0);
        System.out.println("T: 80 , P: 80.0  :"+ex.accesOK.test(testPetit));

        Paire testGrand = new Paire(250, 80.0);
        System.out.println("T: 250 , P: 80.0 :"+ex.accesOK.test(testGrand));


    }
}