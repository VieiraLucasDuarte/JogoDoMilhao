package Servico;

import Contrato.RespostaContrato;
import Domain.Objeto.RespostaDomain;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RespostaContratoService implements RespostaContrato {

    public List<RespostaDomain> getAllRespostas() {
        String arquivo = "C:\\Users\\Lucas\\projetos\\JogoDoMilhao\\Db\\respostas.txt";
        List<RespostaDomain> respostaDomains = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 5) {
                    int id = Integer.parseInt(partes[0]);
                    String opcao = partes[1];
                    String texto = partes[2];
                    int idPergunta = Integer.parseInt(partes[3]);
                    boolean certo = Boolean.parseBoolean(partes[4]);

                    RespostaDomain respostaDomain = new RespostaDomain(id, opcao, texto, idPergunta, certo);
                    respostaDomains.add(respostaDomain);
                }
            }
        } catch (IOException e) {
            System.out.println("Tente abrir denovo o arquivo");
        }
        return respostaDomains;
    }

    public List<RespostaDomain> getAllRespByPerg(int pergunta) {
        return getAllRespostas().stream().filter(x -> x.getPergunta() == pergunta).toList();
    }
}
