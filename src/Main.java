import Contract.Resposta;
import Jogando.Jogo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Jogo jogar = new Jogo();
        Scanner scan = new Scanner(System.in);
        System.out.println("Qual modo voce que Jogar. S/N");
        String modo = scan.nextLine();
        if(modo.equals("S"))
        {
            jogar.Jogar();
        }

        //corrigir essa situação da inicialização da interface

        //verificar como iniciar a interface sem ela ser nula
        //verificar a possibilida do metodo main so chamar o metodo que faz tudo e nesse metodo que faz a maioria das coisas
        /// metodo main servira  so de menu para adicionar novas perguntas que dps sera feito essa rotinas
        // metodo mais com um switch case de tres opções jogar, adicionar pergunas e sair
    }
}