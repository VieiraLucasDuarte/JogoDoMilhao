package Jogando;

import Contract.Pergunta;
import Contract.Resposta;
import Domain.Object.Player;
import Service.PerguntaService;
import Service.RespostaService;

import java.util.List;
import java.util.Scanner;

public class Jogo {
    public void Jogar() {
        Resposta _resposta = new RespostaService();
        Pergunta _pergunta = new PerguntaService();
        Service.PlayerService _player = new Service.PlayerService();
        Scanner scan1 = new Scanner(System.in);
        boolean jogando = true;

        List<Domain.Object.Pergunta> perguntas = _pergunta.getAllPerguntas();
        List<Domain.Object.Resposta> respostas = _resposta.getAllRespostas();

        while (jogando) {
            System.out.println("Nivel 1 - Perguntas acumulam 1000 reais");
            boolean compete1 = true;
            boolean compete2 = false;
            boolean compete3 = false;
            boolean fim = false;
            System.out.println("Qual seu nome?");
            String nome = scan1.nextLine();
            Player player = new Player(1, nome, 0);

            while (compete1) {
                System.out.println("Você está no nivel 1");
                Scanner scanResP = new Scanner(System.in);
                List<Domain.Object.Pergunta> pergunta1 = _pergunta.getAllPergByNivel(1).subList(0, 5);
                int conta = 0;
                for (Domain.Object.Pergunta perg : pergunta1) {
                    conta = conta + 1;
                    String certa = "";
                    System.out.println("Pergunta valendo " + (player.getDinheiro() + 1000));
                    System.out.println(perg.getTexto());
                    List<Domain.Object.Resposta> resp = _resposta.getAllRespByPerg(perg.getId());
                    for (Domain.Object.Resposta resposta : resp) {
                        System.out.println(resposta.getOpcao() + " " + resposta.getResposta());
                        if (resposta.isCerto() == true)
                            certa = resposta.getOpcao();
                    }
                    String opcao = scanResP.nextLine();
                    if (opcao.toUpperCase().equals(certa.toUpperCase())) {
                        System.out.println("Resposta certa");
                        player = _player.CalculoValor(1, player);
                        System.out.println(player.getNome() + " Você está com " + player.getDinheiro());
                    } else {
                        jogando = false;
                        compete1 = false;
                        System.out.println("O jogo acabou você perdeu tudo");
                        break;
                    }
                }
                if (conta == 5) {
                    System.out.println("Você passou de nivel!!!!");
                    compete2 = true;
                }

                compete1 = false;
            }
            while (compete2) {
                System.out.println("Você está no nivel 2");
                Scanner scanResP = new Scanner(System.in);
                //corrigir aq
                List<Domain.Object.Pergunta> pergunta2 = _pergunta.getAllPergByNivel(1).subList(0, 5);
                int conta = 0;
                for (Domain.Object.Pergunta perg : pergunta2) {
                    conta = conta + 1;

                    String certa = "";
                    System.out.println("Pergunta valendo " + (conta * 10000));
                    System.out.println(perg.getTexto());
                    List<Domain.Object.Resposta> resp = _resposta.getAllRespByPerg(perg.getId());
                    for (Domain.Object.Resposta resposta : resp) {
                        System.out.println(resposta.getOpcao() + " " + resposta.getResposta());
                        if (resposta.isCerto() == true)
                            certa = resposta.getOpcao();
                    }
                    String opcao = scanResP.nextLine();
                    if (opcao.toUpperCase().equals(certa.toUpperCase())) {
                        System.out.println("Resposta certa");
                        player = _player.CalculoValor(1, player);
                        System.out.println(player.getNome() + " Você está com " + player.getDinheiro());
                    } else {
                        jogando = false;
                        compete2 = false;
                        System.out.println("O jogo acabou você perdeu tudo");
                        break;
                    }
                }
                if (conta == 5) {
                    System.out.println("Você passou de nivel!!!!");
                    compete3 = true;
                }
                compete2 = false;

            }
            while (compete3) {
                System.out.println("Você está no nivel 3");
                Scanner scanResP = new Scanner(System.in);
                //corrigir aq
                List<Domain.Object.Pergunta> pergunta3 = _pergunta.getAllPergByNivel(1).subList(0, 5);
                int conta = 0;
                for (Domain.Object.Pergunta perg : pergunta3) {
                    conta = conta + 1;
                    String certa = "";
                    System.out.println("Pergunta valendo " + (conta * 100000));
                    System.out.println(perg.getTexto());
                    List<Domain.Object.Resposta> resp = _resposta.getAllRespByPerg(perg.getId());
                    for (Domain.Object.Resposta resposta : resp) {
                        System.out.println(resposta.getOpcao() + " " + resposta.getResposta());
                        if (resposta.isCerto() == true)
                            certa = resposta.getOpcao();
                    }
                    String opcao = scanResP.nextLine();
                    if (opcao.toUpperCase().equals(certa.toUpperCase())) {
                        System.out.println("Resposta certa");
                        player = _player.CalculoValor(1, player);
                        System.out.println(player.getNome() + " Você está com " + player.getDinheiro());
                    } else {
                        jogando = false;
                        compete2 = false;
                        System.out.println("O jogo acabou você perdeu tudo");
                        break;
                    }
                }
                if (conta == 5) {
                    System.out.println("Você passou de nivel!!!!");
                    fim = true;
                }
                compete3 = false;
            }
            while (fim) {
                System.out.println("Você está na final");
                Scanner scanResP = new Scanner(System.in);
                //corrigir aq
                List<Domain.Object.Pergunta> pergFim = _pergunta.getAllPergByNivel(1).subList(0, 1);
                int conta = 0;
                for (Domain.Object.Pergunta perg : pergFim) {
                    conta = conta + 1;
                    String certa = "";
                    System.out.println("Pergunta valendo " + (player.getDinheiro() + 10000));
                    System.out.println(perg.getTexto());
                    List<Domain.Object.Resposta> resp = _resposta.getAllRespByPerg(perg.getId());
                    for (Domain.Object.Resposta resposta : resp) {
                        System.out.println(resposta.getOpcao() + " " + resposta.getResposta());
                        if (resposta.isCerto() == true)
                            certa = resposta.getOpcao();
                    }
                    String opcao = scanResP.nextLine();
                    if (opcao.toUpperCase().equals(certa.toUpperCase())) {
                        System.out.println("Resposta certa");
                        player = _player.CalculoValor(1, player);
                        System.out.println(player.getNome() + " Você está com " + player.getDinheiro());
                    } else {
                        jogando = false;
                        compete2 = false;
                        System.out.println("O jogo acabou você perdeu tudo");
                        break;
                    }
                    System.out.println("Você está milhonario");
                    fim = true;
                }
            }
        }
    }
}
