package Jogando;

import Contract.Pergunta;
import Contract.Resposta;
import Domain.Object.Player;
import FileManipulation.Repository.PerguntaFile;
import FileManipulation.Repository.RespostaFile;

import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Jogo {
    public void Jogar() {
        Resposta _resposta = new RespostaFile();
        Pergunta _pergunta = new PerguntaFile();
        Scanner scan1 = new Scanner(System.in);
        boolean jogando = true;

        List<Domain.Object.Pergunta> perguntas = _pergunta.getAllPerguntas();
        List<Domain.Object.Resposta> respostas = _resposta.getAllRespostas();

        while (jogando) {
            System.out.println("Nivel 1 - Perguntas acumulam 1000 reais");
            boolean compete1 = true;
            System.out.println("Qual seu nome?");
            String nome = scan1.nextLine();
            Player player = new Player( 1,nome, 0);

            while (compete1) {
                Scanner scanResP = new Scanner(System.in);
                List<Domain.Object.Pergunta> pergunta1 = perguntas.stream().filter(x -> x.getNivelPergunta() == 1).toList().subList(0, 5);
                for (Domain.Object.Pergunta perg : pergunta1) {
                    String certa = "";
                    System.out.println("Pergunta valendo " + player.getDinheiro() + 1000);
                    System.out.println(perg.getTexto());
                    List<Domain.Object.Resposta> resp = respostas.stream().filter(x -> x.getPergunta() == perg.getId()).toList();
                    for (Domain.Object.Resposta resposta : resp) {
                        System.out.println(resposta.getOpcao() + " " + resposta.getResposta());
                        if(resposta.isCerto() == true)
                            certa = resposta.getOpcao();
                    }
                    String opcao = scanResP.nextLine();
                    if(opcao.toUpperCase().equals(certa.toUpperCase())) {
                        System.out.println("Resposta certa");
                        player = CalculoValor(1, player);
                        System.out.println(player.getNome() + " Você está com " + player.getDinheiro());
                    } else {
                        jogando = false;
                        compete1 = false;
                        System.out.println("O jogo acabou você perdeu tudo");
                        break;
                    }
                }
                compete1 = false;
            }

            while(compete2) {
                System.out.println("Parte2");
            }
        }
    }
    private Player CalculoValor(int niveis, Player player) {
        if(niveis == 1) {
            double valor = player.getDinheiro();
            player.setDinheiro(valor + 1000);
        }
        return player;
    }

}
