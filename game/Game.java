package game;

import game.gamer.IGamer;
import game.gamer.Jepa;

public class Game {
    public static void main(String[] args) {
        Host host = new Host();
        IGamer jepa = new Jepa(host);
        host.startGame();
    }
}
