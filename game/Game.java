package game;

import game.gamer.Gamer;
import game.gamer.Jepa;
import game.gamer.KYS;
import game.gamer.SYS;

public class Game {
    public static void main(String[] args) {
        Host host = new Host();

        Gamer jepa = new Jepa();
        Gamer KYS = new KYS();
        Gamer SYS = new SYS();

        host.receiveApplication(jepa);
        host.receiveApplication(KYS);
        host.receiveApplication(SYS);

        host.startGame();
    }
}
