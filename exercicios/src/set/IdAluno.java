package set;

import java.util.Objects;

public class IdAluno {

    private int id;

    public IdAluno(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdAluno idAluno = (IdAluno) o;
        return id == idAluno.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
