package POO.ExemploPilaresPOO02;

import POO.ExemploPilaresPOO02.Apps.FacebookMessenger;
import POO.ExemploPilaresPOO02.Apps.MSNMessenger;
import POO.ExemploPilaresPOO02.Apps.ServicoMensagemInstanea;
import POO.ExemploPilaresPOO02.Apps.Telegram;

public class ComputadorOtavio {
    public static void main(String[] args) {
        ServicoMensagemInstanea smi = null;

        String appEscolhido = "msn";

        if(appEscolhido.equals("msn")){
            smi = new MSNMessenger();
        } else if(appEscolhido.equals("face")){
            smi = new FacebookMessenger();
        } else if(appEscolhido.equals("tlg")) {
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();
    }

}
