import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Comparator<Candidate> candidateComparator = new CandidateRevelanceComparator().
                thenComparing(new CandidateRatingComparator());
        TreeSet<Candidate> candidateSelection = new TreeSet<>(candidateComparator);


        Candidate candidateOne = new Candidate("Popov Ivan Borisovich", "27", 4, 3);
        Candidate candidateTwo = new Candidate("Lauren John Smith", "22", 4, 5);
        Candidate candidateThree = new Candidate("Stepanov Igor Sergeevich", "25", 3, 5);
        Candidate candidateFour = new Candidate("Moris Harry Potter", "28", 5, 4);
        Candidate candidateFive = new Candidate("Paula Franko Ferrari", "20", 3, 4);
        Candidate candidateSix = new Candidate("Tomas Edison Ericsson  ", "23", 2, 5);

        candidateSelection.add(candidateOne);
        candidateSelection.add(candidateTwo);
        candidateSelection.add(candidateThree);
        candidateSelection.add(candidateFour);
        candidateSelection.add(candidateFive);
        candidateSelection.add(candidateSix);

        System.out.println("Список кандидатов:");
        for(Candidate printCandidate : candidateSelection.descendingSet()) {
            System.out.println(printCandidate);
        }

    }

}
