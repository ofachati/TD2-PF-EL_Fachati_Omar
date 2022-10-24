


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

    Somme< Integer> addition_int = (a, b) -> a + b;
    System.out.println(" 6 + 8 = " + addition_int.sommer(   6, 8));
    Somme<Double> addition_double =  (a, b) -> a + b;
    Somme<Long> addition_long =  (a, b) -> a + b;
    Somme<String> addition_string =  (a, b) -> a + b;
    System.out.println(" 6 + 8 = " + addition_int.sommer(   6, 8));

    }
}