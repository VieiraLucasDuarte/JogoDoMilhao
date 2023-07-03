package FileManipulation.Repository;

import Contract.Resposta;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RespostaFile implements Resposta {

    public List<Domain.Object.Resposta> getAllRespostas() {
        String arquivo = "C:\\Users\\Lucas\\projetos\\JogoDoMilhao\\Db\\respostas.txt";
        List<Domain.Object.Resposta> respostas = new ArrayList<>();
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

                    Domain.Object.Resposta resposta = new Domain.Object.Resposta(id, opcao, texto, idPergunta, certo);
                    respostas.add(resposta);
                }
            }
        } catch (IOException e) {
            System.out.println("Tente abrir denovo o arquivo");
        }
        return respostas;
    }
}
