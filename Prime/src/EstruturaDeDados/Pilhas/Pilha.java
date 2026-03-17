package EstruturaDeDados.Pilhas;

public class Pilha {

    private No3 refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public No3 top() {
        return refNoEntradaPilha;
    }

    public void push(No3 novoNo) {

        No3 refAuxiliar = refNoEntradaPilha;
        refNoEntradaPilha = novoNo;
        refNoEntradaPilha.setRefNo(refAuxiliar);
    }

    public No3 pop() {

        if (!this.isEmpty()) {
            No3 noPoped = refNoEntradaPilha;
            refNoEntradaPilha = refNoEntradaPilha.getRefNo();
            return noPoped;
        }
        return null;
    }

    public boolean isEmpty() {

        if (refNoEntradaPilha == null) {
            return true;
        }
        return false;

        // return refNoEntradaPilha == null ? true : false;
    }
    
    @Override
    
    public String toString() {

        String stringRetorno = "----------------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "----------------\n";

        No3 noAuxiliar = refNoEntradaPilha;

        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getRefNo();
            } else {
                break;
            }
        }

        stringRetorno += "================\n";
        return stringRetorno;
    }
}
