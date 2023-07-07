package Contrato;

import Domain.Objeto.PerguntaDomain;

import java.util.List;

public interface PerguntaContrato {
    List<PerguntaDomain> getAllPerguntas();
    List<PerguntaDomain> getAllPergByNivel(int nivel);
}
