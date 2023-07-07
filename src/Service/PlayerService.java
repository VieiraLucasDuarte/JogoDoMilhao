package Service;

import Contract.Player;

import java.util.Scanner;

public class PlayerService implements Player {

    public Domain.Object.Player CalculoValor(int niveis, Domain.Object.Player player) {
        if (niveis == 1) {
            double valor = player.getDinheiro();
            player.setDinheiro(valor + 1000);
        } else if (niveis == 2) {
            double valor = player.getDinheiro();
            player.setDinheiro(valor + 10000);
        } else if (niveis == 3) {
            double valor = player.getDinheiro();
            player.setDinheiro(valor + 100000);
        }
        return player;
    }

    public boolean ValidaContinua(Domain.Object.Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Você tem " + player.getDinheiro() + " ainda quer continuar jogando?");
        System.out.println("Para parar de jogar digite 1");
        System.out.println("Para continuar aperte qualquer tecla");
        String continua = scan.nextLine();
        if (continua.equals("1")) {
            System.out.println("O jogo terminou");
            return false;
        } else
            return true;
    }

    public void limparConsole() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
        }
    }


}
