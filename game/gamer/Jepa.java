package game.gamer;

import game.Host;

public class Jepa implements IGamer{
    Host host;//누가올지모름

    public Jepa(Host host){
       this.host = host;//나도알고 너도알고
    }
    @Override
    public int answer(Host host) {
        return 0;
    }

    @Override
    public String getName() {
        return "jepa";
    }
}
