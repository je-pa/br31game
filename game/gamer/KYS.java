package game.gamer;

import game.Host;

public class KYS implements Gamer {
    @Override
    public int answer(int currentNum, int GamerNumber) {
        return 1;//(int)(Math.random()*3+1);
    }

    @Override
    public String getName() {
        return "KYS";
    }
}
