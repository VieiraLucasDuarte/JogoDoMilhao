package Jogando;

import Contrato.PerguntaContrato;
import Contrato.PlayerContrato;
import Contrato.RespostaContrato;
import Domain.Objeto.PerguntaDomain;
import Domain.Objeto.PlayerDomain;
import Domain.Objeto.RespostaDomain;
import Servico.PerguntaContratoService;
import Servico.PlayerContratoService;
import Servico.RespostaContratoService;

import java.util.List;
import java.util.Scanner;

public class Geral {
    public void Jogar() {
        RespostaContrato _respostaContrato = new RespostaContratoService();
        PerguntaContrato _perguntaContrato = new PerguntaContratoService();
        PlayerContrato _playerContrato = new PlayerContratoService();
        Scanner scan1 = new Scanner(System.in);
        boolean play = true;
        List<PerguntaDomain> perguntaDomains = _perguntaContrato.getAllPerguntas();
        List<RespostaDomain> respostaDomains = _respostaContrato.getAllRespostas();

        while (play) {
            System.out.println("Nivel facil - Perguntas acumulam 1000 reais");
            boolean jogando1 = true;
            boolean jogando2 = false;
            boolean jogando3 = false;
            boolean fim = false;
            System.out.println("Digite seu nome:");
            String nome = scan1.nextLine();
            PlayerDomain playerDomain = new PlayerDomain(1, nome, 0);

            while (jogando1) {
                System.out.println("Você está no nivel facil");
                Scanner scanResP = new Scanner(System.in);
                List<PerguntaDomain> perguntaDomain1 = _perguntaContrato.getAllPergByNivel(1).subList(0, 5);
                int conta = 0;
                for (PerguntaDomain perg : perguntaDomain1) {
                    conta = conta + 1;
                    String certa = "";
                    System.out.println("Valendo " + (playerDomain.getDinheiro() + 1000));
                    System.out.println(perg.getTexto());
                    List<RespostaDomain> resp = _respostaContrato.getAllRespByPerg(perg.getId());
                    for (RespostaDomain respostaDomain : resp) {
                        System.out.println(respostaDomain.getOpcao() + " " + respostaDomain.getResposta());
                        if (respostaDomain.isCerto() == true)
                            certa = respostaDomain.getOpcao();
                    }
                    String opcao = scanResP.nextLine();
                    if (opcao.toUpperCase().equals(certa.toUpperCase())) {
                        System.out.println("Certa Resposta");
                        playerDomain = _playerContrato.CalculoValor(1, playerDomain);
                        System.out.println(playerDomain.getNome() + " Você está com " + playerDomain.getDinheiro());
                    } else {
                        play = false;
                        jogando1 = false;
                        System.out.println("O jogo acabou você perdeu tudo");
                        break;
                    }
                }
                if (conta == 5) {
                    System.out.println("Você passou de nivel!!!!");
                    jogando2 = true;
                }
                jogando1 = false;
            }
            while (jogando2) {
                System.out.println("Você está no nivel medio");
                Scanner scanResP = new Scanner(System.in);
                List<PerguntaDomain> perguntaDomain2 = _perguntaContrato.getAllPergByNivel(1).subList(0, 5);
                int conta = 0;
                for (PerguntaDomain perg : perguntaDomain2) {
                    conta = conta + 1;
                    String certa = "";
                    System.out.println("Pergunta valendo " + (conta * 10000));
                    System.out.println(perg.getTexto());
                    List<RespostaDomain> resp = _respostaContrato.getAllRespByPerg(perg.getId());
                    for (RespostaDomain respostaDomain : resp) {
                        System.out.println(respostaDomain.getOpcao() + " " + respostaDomain.getResposta());
                        if (respostaDomain.isCerto() == true)
                            certa = respostaDomain.getOpcao();
                    }
                    String opcao = scanResP.nextLine();
                    if (opcao.toUpperCase().equals(certa.toUpperCase())) {
                        System.out.println("Certa Resposta");
                        playerDomain = _playerContrato.CalculoValor(1, playerDomain);
                        System.out.println(playerDomain.getNome() + " Você está com " + playerDomain.getDinheiro());
                    } else {
                        play = false;
                        jogando2 = false;
                        System.out.println("O jogo acabou você perdeu tudo");
                        break;
                    }
                }
                if (conta == 5) {
                    System.out.println("Você passou de nivel!!!!");
                    jogando3 = true;
                }
                jogando2 = false;

            }
            while (jogando3) {
                System.out.println("Você está no nivel dificil");
                Scanner scanResP = new Scanner(System.in);
                List<PerguntaDomain> perguntaDomain3 = _perguntaContrato.getAllPergByNivel(1).subList(0, 5);
                int conta = 0;
                for (PerguntaDomain perg : perguntaDomain3) {
                    conta = conta + 1;
                    String certa = "";
                    System.out.println("Pergunta valendo " + (conta * 100000));
                    System.out.println(perg.getTexto());
                    List<RespostaDomain> resp = _respostaContrato.getAllRespByPerg(perg.getId());
                    for (RespostaDomain respostaDomain : resp) {
                        System.out.println(respostaDomain.getOpcao() + " " + respostaDomain.getResposta());
                        if (respostaDomain.isCerto() == true)
                            certa = respostaDomain.getOpcao();
                    }
                    String opcao = scanResP.nextLine();
                    if (opcao.toUpperCase().equals(certa.toUpperCase())) {
                        System.out.println("Certa Resposta");
                        System.out.println(playerDomain.getNome() + " Você está com " + playerDomain.getDinheiro());
                        playerDomain = _playerContrato.CalculoValor(1, playerDomain);
                    } else {
                        play = false;
                        jogando2 = false;
                        System.out.println("O jogo acabou você perdeu tudo");
                        break;
                    }
                }
                if (conta == 5) {
                    System.out.println("Você passou de nivel!!!!");
                    fim = true;
                }
                jogando3 = false;
            }
            while (fim) {
                System.out.println("Você está na final");
                Scanner scanResP = new Scanner(System.in);
                //corrigir aq
                List<PerguntaDomain> pergFim = _perguntaContrato.getAllPergByNivel(1);
                int conta = 0;
                for (PerguntaDomain perg : pergFim.subList(0,1)) {
                    conta = conta + 1;
                    String certa = "";
                    System.out.println("Pergunta valendo " + (playerDomain.getDinheiro() + 10000));
                    System.out.println(perg.getTexto());
                    List<RespostaDomain> resp = _respostaContrato.getAllRespByPerg(perg.getId());
                    for (RespostaDomain respostaDomain : resp) {
                        System.out.println(respostaDomain.getOpcao() + " " + respostaDomain.getResposta());
                        if (respostaDomain.isCerto() == true)
                            certa = respostaDomain.getOpcao();
                    }
                    String opcao = scanResP.nextLine();
                    if (opcao.toUpperCase().equals(certa.toUpperCase())) {
                        System.out.println("Resposta certa");
                        playerDomain = _playerContrato.CalculoValor(1, playerDomain);
                        System.out.println(playerDomain.getNome() + " Você está com " + playerDomain.getDinheiro());
                    } else {
                        play = false;
                        jogando2 = false;
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
