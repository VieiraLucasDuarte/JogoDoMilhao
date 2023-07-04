package Service;

import Contract.Pergunta;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PerguntaService implements Pergunta {
    public List<Domain.Object.Pergunta> getAllPerguntas() {
        String arquivo = "C:\\Users\\Lucas\\projetos\\JogoDoMilhao\\Db\\perguntas.txt";
        List<Domain.Object.Pergunta> perguntas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 4) {
                    int id = Integer.parseInt(partes[0]);
                    String texto = partes[1];
                    boolean perguntado = Boolean.parseBoolean(partes[2]);
                    int nivel = Integer.parseInt(partes[3]);

                    Domain.Object.Pergunta Pergunta = new Domain.Object.Pergunta(id, texto, perguntado, nivel);
                    perguntas.add(Pergunta);
                }
            }
        } catch (IOException e) {
            System.out.println("Tente abrir denovo o arquivo");
        }
        System.out.println(perguntas.get(0) +  "  Lisitnhas");
        return perguntas;
    }

    public List<Domain.Object.Pergunta> getAllPergByNivel(int nivel) {
        return getAllPerguntas().stream().filter(x -> x.getNivelPergunta() == nivel).toList();
    }
}
