package task5;

import java.util.Objects;

public class StudentSimple {
    private int kurs;
    private String name;

    public StudentSimple(int kurs, String name) {
        this.kurs = kurs;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentSimple student = (StudentSimple) o;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
