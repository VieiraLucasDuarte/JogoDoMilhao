package Teste;

import Contrato.PerguntaContrato;
import Domain.Objeto.PerguntaDomain;
import Servico.PerguntaContratoService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class TestePergunta {
    @Test
    public void ConsultaTeste() {
        PerguntaContrato perguntaContrato = new PerguntaContratoService();
        List<PerguntaDomain> resutado = perguntaContrato.getAllPerguntas();
        Assert.assertNotNull(resutado);
        Assert.assertFalse(resutado.isEmpty());
    }

    @Test
    public void ConsultaTesteByNivel1() {
        PerguntaContrato perguntaContrato = new PerguntaContratoService();
        List<PerguntaDomain> resutado = perguntaContrato.getAllPergByNivel(1);
        Assert.assertNotNull(resutado);
        Assert.assertFalse(resutado.isEmpty());
    }

    @Test
    public void ConsultaTesteByNivel2() {
        PerguntaContrato perguntaContrato = new PerguntaContratoService();
        List<PerguntaDomain> resutado = perguntaContrato.getAllPergByNivel(2);
        Assert.assertNotNull(resutado);
        Assert.assertFalse(resutado.isEmpty());
    }

    @Test
    public void ConsultaTesteByNivel3() {
        PerguntaContrato perguntaContrato = new PerguntaContratoService();
        List<PerguntaDomain> resutado = perguntaContrato.getAllPergByNivel(3);
        Assert.assertNotNull(resutado);
        Assert.assertFalse(resutado.isEmpty());
    }

    @Test
    public void ConsultaTesteByNivel4() {
        PerguntaContrato perguntaContrato = new PerguntaContratoService();
        List<PerguntaDomain> resutado = perguntaContrato.getAllPergByNivel(4);
        Assert.assertNotNull(resutado);
        Assert.assertFalse(resutado.isEmpty());
    }
}
