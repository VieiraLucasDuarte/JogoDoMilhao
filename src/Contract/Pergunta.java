package Contract;

import java.util.List;

public interface Pergunta {
    List<Domain.Object.Pergunta> getAllPerguntas();
    List<Domain.Object.Pergunta> getAllPergByNivel(int nivel);
}
