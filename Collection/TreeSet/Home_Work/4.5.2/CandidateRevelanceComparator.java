package HomeWork;

import java.util.Comparator;

public class CandidateRevelanceComparator implements Comparator<Candidate> {
    @Override
    public int compare(Candidate candidateFirst, Candidate candidateSecond) {
        return candidateFirst.getRelevance().compareTo(candidateSecond.getRelevance());
    }
}
