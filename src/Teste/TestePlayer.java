package Teste;

import Contrato.PlayerContrato;
import Domain.Objeto.PlayerDomain;
import Servico.PlayerContratoService;
import org.junit.Assert;
import org.junit.Test;


public class TestePlayer {
    @Test
    public void CalculaValorTeste() {
        PlayerContrato playerContrato = new PlayerContratoService();
        PlayerDomain play = new PlayerDomain(1, "Lucas", 1000);
        playerContrato.CalculoValor(1, play);
    }

    @Test
    public void ValidaContinua() {
        PlayerContrato playerContrato = new PlayerContratoService();
        PlayerDomain play = new PlayerDomain(1, "Lucas", 1000);

        boolean resultado = playerContrato.ValidaContinua(play);
        Assert.assertTrue(resultado);

        PlayerDomain play2 = new PlayerDomain(1, "Lucas", 1000);
        boolean resultFalse = playerContrato.ValidaContinua(play2);
        Assert.assertFalse(resultado);
    }
    
}
