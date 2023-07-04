package Service;

import Contract.Player;

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
}
