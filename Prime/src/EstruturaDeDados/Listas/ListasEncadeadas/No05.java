package EstruturaDeDados.Listas.ListasEncadeadas;

public class No05<T> {
    private T conteudo;
    private No05 proximoNo = null;

    public No05(T conteudo){
        this.conteudo = conteudo;
    }

    public No05(T conteudo, No05 proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public No05 getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No05 proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "No{" + conteudo + '}';
    }

    public String toStringEncadeado() {
        String str = "No{" + conteudo + "}";

        if(proximoNo != null){
            str += "->" + proximoNo.toString();
        }else{
            str += "->null";
        }
        return str;
    }
}