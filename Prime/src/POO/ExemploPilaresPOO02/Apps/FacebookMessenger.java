package POO.ExemploPilaresPOO02.Apps;

public class FacebookMessenger extends ServicoMensagemInstanea {
    public void enviarMensagem() {

        validarConectadoInternet();
        salvarHistoricoMensagem();

        System.out.println("Enviando mensagem pelo Messenger");   
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Messenger");
    }
}
