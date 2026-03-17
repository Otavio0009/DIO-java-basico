package EstruturaDeDados.Filas;

public class Fila<T> {

    private No04<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public void enqueue(T obj) {

        No04<T> novoNo = new No04<>(obj);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first() {
        if (!this.isEmpty()) {

            No04<T> primeiroNo = refNoEntradaFila;

            while (true) {

                if (primeiroNo.getRefNo() != null) {

                    primeiroNo = primeiroNo.getRefNo();
                } else {

                    break;
                }
            }

            return (T) primeiroNo.getObject();
        }

        return null;
    }

    public T dequeue() {

        if (!this.isEmpty()) {

            No04<T> primeiroNo = refNoEntradaFila;
            No04<T> noAuxiliar = refNoEntradaFila;

            while (true) {

                if (primeiroNo.getRefNo() != null) {

                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {

                    noAuxiliar.setRefNo(null);
                    break;
                }
            }

            return (T) primeiroNo.getObject();
        }

        return null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {

        String stringRetorno = "";
        No04<T> noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null) {

            while (true) {

                stringRetorno += "[No{object=" + noAuxiliar.getObject() + "}]--->";

                if (noAuxiliar.getRefNo() != null) {

                    noAuxiliar = noAuxiliar.getRefNo();
                } else {

                    break;
                }
            }
        } else {

            stringRetorno = "Fila Vazia";
        }
        return stringRetorno;
    }
}
