package Contrato;

import Domain.Objeto.RespostaDomain;

import java.util.List;

public interface RespostaContrato {
    List<RespostaDomain> getAllRespostas();
    List<RespostaDomain> getAllRespByPerg(int pergunta);
}
