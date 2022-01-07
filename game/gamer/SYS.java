package game.gamer;

import game.Host;

import java.util.Random;

public class SYS implements Gamer {

    @Override
    public int answer(int currentNum, int GamerNumber) {
        return (int)(Math.random()*3+1);
    }

    @Override
    public String getName() {
        return "SYS";
    }
}
