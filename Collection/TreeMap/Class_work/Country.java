public class Country implements Comparable<Country> {
    protected String name;
    protected int population;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public int compareTo(Country country) {
        if (population > country.population) {
            return 1;
        } else if (population < country.population) {
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public boolean equals(Object obj) {
       return ((Country)obj).population == population;
    }

    @Override
    public String toString() {
        return name + " (" + population + ") ";

    }
}
