package Teste;

import Contract.Player;
import Service.PlayerService;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;


public class PlayerTeste {
    @Test
    public void CalculaValorTeste() {
        Player player = new PlayerService();
        Domain.Object.Player play = new Domain.Object.Player(1, "Lucas", 1000);
        player.CalculoValor(1, play);
    }

    @Test
    public void ValidaContinua() {
        Player player = new PlayerService();
        Domain.Object.Player play = new Domain.Object.Player(1, "Lucas", 1000);

        boolean resultado = player.ValidaContinua(play);
        Assert.assertTrue(resultado);

        Domain.Object.Player play2 = new Domain.Object.Player(1, "Lucas", 1000);
        boolean resultFalse = player.ValidaContinua(play2);
        Assert.assertFalse(resultado);
    }
    
}
