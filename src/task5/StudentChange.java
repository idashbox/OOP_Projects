package task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class StudentChange {
    private int kurs;
    private String name;
    private List<Integer> marks;

    public StudentChange(int kurs, String name, List<Integer> marks) {

        this.kurs = kurs;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentChange that = (StudentChange) o;
        return kurs == that.kurs && Objects.equals(name, that.name) && Objects.equals(marks, that.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kurs, name);
    }
}
