import Contract.Resposta;
import Jogando.Jogo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Jogo jogar = new Jogo();
        Scanner scan = new Scanner(System.in);
        System.out.println("1) jogar");
        System.out.println("2) Regras");
        String modo = scan.nextLine();
        if(modo.equals("1")) {
            jogar.Jogar();
        }
    }
}