package POO.ExemploPilaresPOO02.Apps;

public class MSNMessenger extends ServicoMensagemInstanea{
    public void enviarMensagem() {

        validarConectadoInternet();
        salvarHistoricoMensagem();

        System.out.println("Enviando mensagem pelo MSN");   
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN");
    }
}
