package POO.ExemploPilaresPOO02.Apps;

public class Telegram extends ServicoMensagemInstanea {
    public void enviarMensagem() {

        validarConectadoInternet();
        salvarHistoricoMensagem();

        System.out.println("Enviando mensagem pelo Telegram");   
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}
