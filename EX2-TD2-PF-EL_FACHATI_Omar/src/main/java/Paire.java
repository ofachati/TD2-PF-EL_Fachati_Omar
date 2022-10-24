import static java.util.function.Predicate.not;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


public class Paire<T,U> {
    public T fst;
    public U snd;
    public Paire(T fst, U snd) {
        this.fst = fst;
        this.snd = snd;
    }
    @Override public String toString() {
        return String.format("(%s,%s)",fst.toString(),snd.toString());
    }



    //question 1
    Predicate<Paire<Integer, Double>> ttp = p -> p.fst < 100; // appel à la paire avec la fonction fst
    Predicate<Paire<Integer, Double>> ttg = p -> p.fst > 200; // appel à la paire avec la fonction fst
    Predicate<Paire<Integer, Double>> tailleIncorrecte = p -> ttp.test(p) || ttg.test(p);
    Predicate<Paire<Integer, Double>> tailleCorrecte = Predicate.not(tailleIncorrecte);
    Predicate<Paire<Integer, Double>> ptl = p -> p.snd > 150.0;
    Predicate<Paire<Integer, Double>> poidCorrect = Predicate.not(ptl);
    Predicate<Paire<Integer, Double>>  accesOK= p -> tailleCorrecte.test(p) && poidCorrect.test(p);
}