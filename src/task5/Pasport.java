package task5;

import java.util.Objects;

public class Pasport {
    private int number;
    private int series;

    public Pasport(int number, int series) {
        this.number = number;
        this.series = series;
    }

    public int getNumber() {
        return number;
    }

    public int getSeries() {
        return series;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pasport pasport = (Pasport) o;
        return number == pasport.number && series == pasport.series;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, series);
    }
}
