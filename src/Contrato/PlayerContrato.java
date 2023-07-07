package Contrato;

import Domain.Objeto.PlayerDomain;

public interface PlayerContrato {
    PlayerDomain CalculoValor(int niveis, PlayerDomain playerDomain);
    boolean ValidaContinua(PlayerDomain playerDomain);
}
