package Teste;

import Contract.Pergunta;
import Service.PerguntaService;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class PerguntasTeste {
    @Test
    public void ConsultaTeste() {
        Pergunta pergunta = new PerguntaService();
        List<Domain.Object.Pergunta> resutado = pergunta.getAllPerguntas();
        Assert.assertNotNull(resutado);
        Assert.assertFalse(resutado.isEmpty());
    }

    @Test
    public void ConsultaTesteByNivel1() {
        Pergunta pergunta = new PerguntaService();
        List<Domain.Object.Pergunta> resutado = pergunta.getAllPergByNivel(1);
        Assert.assertNotNull(resutado);
        Assert.assertFalse(resutado.isEmpty());
    }

    @Test
    public void ConsultaTesteByNivel2() {
        Pergunta pergunta = new PerguntaService();
        List<Domain.Object.Pergunta> resutado = pergunta.getAllPergByNivel(2);
        Assert.assertNotNull(resutado);
        Assert.assertFalse(resutado.isEmpty());
    }

    @Test
    public void ConsultaTesteByNivel3() {
        Pergunta pergunta = new PerguntaService();
        List<Domain.Object.Pergunta> resutado = pergunta.getAllPergByNivel(3);
        Assert.assertNotNull(resutado);
        Assert.assertFalse(resutado.isEmpty());
    }

    @Test
    public void ConsultaTesteByNivel4() {
        Pergunta pergunta = new PerguntaService();
        List<Domain.Object.Pergunta> resutado = pergunta.getAllPergByNivel(4);
        Assert.assertNotNull(resutado);
        Assert.assertFalse(resutado.isEmpty());
    }
}
