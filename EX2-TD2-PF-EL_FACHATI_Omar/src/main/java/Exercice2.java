import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Exercice2 {


    //question 1
    Predicate<Paire<Integer, Double>> ttp = p -> p.fst < 100;
    Predicate<Paire<Integer, Double>> ttg = p -> p.fst > 200;
    Predicate<Paire<Integer, Double>> tailleIncorrecte = p -> ttp.test(p) || ttg.test(p);
    Predicate<Paire<Integer, Double>> tailleCorrecte = Predicate.not(tailleIncorrecte);
    Predicate<Paire<Integer, Double>> ptl = p -> p.snd > 150.0;
    Predicate<Paire<Integer, Double>> poidCorrect = Predicate.not(ptl);
    Predicate<Paire<Integer, Double>>  accesOK= p -> tailleCorrecte.test(p) && poidCorrect.test(p);


    //Question 2
    public <T> List<T> filtragePredicatif(List<Predicate<T>> Conditions, List<T> elements){

        Predicate<T> predicat = x -> true;
        List<T> resultat = new ArrayList<>();
        for(Predicate<T> p : Conditions){
            predicat = predicat.and(p);
        }
        for(T e : elements) {
            if (predicat.test(e)){
                resultat.add(e);
            }
        }
        return resultat;
    }

}
