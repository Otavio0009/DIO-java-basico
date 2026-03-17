package EstruturaDeDados.Pilhas;

public class No3 {

    private int dado;
    private No3 refNo = null ;

    public No3(int dado) {
        this.dado = dado;
    }
    public int getDado() {
        return dado;
    }
    public void setDado(int dado) {
        this.dado = dado;
    }
    public No3 getRefNo() {
        return refNo;
    }

    public void setRefNo(No3 refNo) {
        this.refNo = refNo;
    }

    public String toString() {
        return "No3{" +
                "dado=" + dado +
                ", refNo=" + refNo +
                '}';
    }
}
