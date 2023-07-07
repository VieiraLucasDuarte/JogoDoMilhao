package Teste;

import Contrato.RespostaContrato;
import Domain.Objeto.RespostaDomain;
import Servico.RespostaContratoService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TesteResposta {
    @Test
    public void ConsultasRespostas() {
        RespostaContrato respostaContrato = new RespostaContratoService();
        List<RespostaDomain> respostaDomains = respostaContrato.getAllRespostas();
        Assert.assertNotNull(respostaDomains);
        Assert.assertFalse(respostaDomains.isEmpty());
    }

    @Test
    public void ConsultasRespostasByPerg() {
        RespostaContrato respostaContrato = new RespostaContratoService();
        List<RespostaDomain> respostaDomains = respostaContrato.getAllRespByPerg(1);
        Assert.assertNotNull(respostaDomains);
        Assert.assertFalse(respostaDomains.isEmpty());
    }


}
