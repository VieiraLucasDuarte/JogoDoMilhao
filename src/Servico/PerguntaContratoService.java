package Servico;

import Contrato.PerguntaContrato;
import Domain.Objeto.PerguntaDomain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PerguntaContratoService implements PerguntaContrato {
    public List<PerguntaDomain> getAllPerguntas() {
        String arquivo = "C:\\Users\\Lucas\\projetos\\JogoDoMilhao\\Db\\perguntas.txt";
        List<PerguntaDomain> perguntaDomains = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 4) {
                    int id = Integer.parseInt(partes[0]);
                    String texto = partes[1];
                    boolean perguntado = Boolean.parseBoolean(partes[2]);
                    int nivel = Integer.parseInt(partes[3]);

                    PerguntaDomain PerguntaDomain = new PerguntaDomain(id, texto, perguntado, nivel);
                    perguntaDomains.add(PerguntaDomain);
                }
            }
        } catch (IOException e) {
            System.out.println("Tente abrir denovo o arquivo");
        }
        return perguntaDomains;
    }

    public List<PerguntaDomain> getAllPergByNivel(int nivel) {
        return getAllPerguntas().stream().filter(x -> x.getNivelPergunta() == nivel).toList();
    }
}
