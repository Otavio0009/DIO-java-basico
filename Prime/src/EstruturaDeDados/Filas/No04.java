package EstruturaDeDados.Filas;

public class No04<T> {

    private T object;
    private No04<T> refNo;

    public No04() {
    }

    public No04(T object) {
        this.object = object;
        this.refNo = null;
    }

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No04<T> getRefNo() {
        return refNo;
    }

    public void setRefNo(No04<T> refNo) {
        this.refNo = refNo;
    }

    @Override
    public String toString() {
        return "No04{" +
                "object=" + object +
                '}';
    }
}
