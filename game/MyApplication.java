package game;

import game.gamer.*;

public class MyApplication {
    public static void main(String[] args) {
        Host host = new Host();

        Gamer jepa = new Jepa("박지은");
        Gamer super31Man = new Super31Man();
        Participant1 participant1 = new Participant1("김영서");

        host.receiveApplication(jepa);
        host.receiveApplication(participant1);
        host.receiveApplication(super31Man);

        host.startGame();
    }
}
