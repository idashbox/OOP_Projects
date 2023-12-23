package task5;

import java.util.Objects;

public class StudentWithPasport {
    Pasport pass;
    private int kurs;

    public StudentWithPasport(Pasport pass, int kurs) {
        this.pass = pass;
        this.kurs = kurs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentWithPasport that = (StudentWithPasport) o;
        return kurs == that.kurs && Objects.equals(pass, that.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pass, kurs);
    }
}
