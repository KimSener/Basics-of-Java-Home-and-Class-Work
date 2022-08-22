package HomeWork;

import java.util.Comparator;

public class CandidateRatingComparator implements Comparator<Candidate> {
    @Override
    public int compare(Candidate candidateFirst, Candidate candidateSecond) {
        return candidateFirst.getRating().compareTo(candidateSecond.getRating());
    }
}
