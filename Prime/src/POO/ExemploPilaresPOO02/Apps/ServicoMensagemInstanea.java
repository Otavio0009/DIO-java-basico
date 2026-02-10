package POO.ExemploPilaresPOO02.Apps;

public abstract class ServicoMensagemInstanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    protected void salvarHistoricoMensagem() {
        System.out.println("Validando que as suas mensagens estão sendo salvas");
    }

    protected void validarConectadoInternet() {
        System.out.println("Validando se está conecatado a internet");
    }
}
