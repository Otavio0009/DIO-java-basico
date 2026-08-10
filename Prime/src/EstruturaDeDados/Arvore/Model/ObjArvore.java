package EstruturaDeDados.Arvore.Model;

public abstract class ObjArvore<T> implements Comparable<T> {

    @Override
    public abstract boolean equals(Object o);

    @Override
    public abstract int hashCode();

    @Override
    public abstract String toString();

}