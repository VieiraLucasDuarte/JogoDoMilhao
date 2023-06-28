package FileManipulation.Repository;

import Contract.Consulta;
import Domain.Object.Resposta;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ConsultasFile implements Consulta {

    public List<Resposta> getAllRespostas() {
        List<Resposta> respostas = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("Arquivo.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";");
                if (partes.length == 4) {
                    int id = Integer.parseInt(partes[0]);
                    String texto = partes[1];
                    int idPergunta = Integer.parseInt(partes[2]);
                    boolean certo = Boolean.parseBoolean(partes[3]);

                    Resposta resposta = new Resposta(id, texto, idPergunta, certo);
                    respostas.add(resposta);
                }
            }
        } catch (Exception e) {
            System.out.println("Tente abrir denovo o arquivo");
        }
        System.out.println(respostas.get(0) +  "  Lisitnhas");
        return respostas;
    }
}
