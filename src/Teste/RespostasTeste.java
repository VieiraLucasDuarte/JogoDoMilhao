package Teste;

import Contract.Pergunta;
import Contract.Resposta;
import Service.PerguntaService;
import Service.RespostaService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class RespostasTeste {
    @Test
    public void ConsultasRespostas() {
        Resposta resposta = new RespostaService();
        List<Domain.Object.Resposta> respostas = resposta.getAllRespostas();
        Assert.assertNotNull(respostas);
        Assert.assertFalse(respostas.isEmpty());
    }

    @Test
    public void ConsultasRespostasByPerg() {
        Resposta resposta = new RespostaService();
        List<Domain.Object.Resposta> respostas = resposta.getAllRespByPerg(1);
        Assert.assertNotNull(respostas);
        Assert.assertFalse(respostas.isEmpty());
    }


}
