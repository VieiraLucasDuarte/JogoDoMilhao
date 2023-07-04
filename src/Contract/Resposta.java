package Contract;

import java.util.List;

public interface Resposta {
    List<Domain.Object.Resposta> getAllRespostas();
    List<Domain.Object.Resposta> getAllRespByPerg(int pergunta);
}
