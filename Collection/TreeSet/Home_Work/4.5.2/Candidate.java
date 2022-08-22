package HomeWork;


public class Candidate {
    private final String fullName;
    private final String age;
    private Integer relevance;

    private Integer rating;


    public Candidate(String fullName, String age, Integer relevance, Integer rating) {
        this.fullName = fullName;
        this.age = age;
        if (relevance <= 5) {
            this.relevance = relevance;
        } else {
            System.out.println("Максимальная релевантность резюме должна не превышать 5 балов");
        }
        if (rating <= 5) {
            this.rating = rating;
        } else {
            System.out.println("Максимальная оценка резюме должна не превышать 5 балов");
        }

    }

    @Override
    public String toString() {

        return fullName + " " + age + ", " + relevance + ", " + rating;
    }

    public Integer getRelevance() {
        return relevance;
    }

    public Integer getRating() {
        return rating;
    }
}