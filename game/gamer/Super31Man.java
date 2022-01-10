package game.gamer;

public class Super31Man implements Gamer {
    private static final int GAME_MAX_NUMBER = 31;
    private static final int MIN_NUMBER_PER = 1;
    private static final int MAX_NUMBER_PER = 3;

    @Override
    public int answer(int currentNum, int gamerNumber) {
        int remainNumber = GAME_MAX_NUMBER - currentNum;

        if (remainNumber <= MAX_NUMBER_PER) {
            return remainNumber;
        }

        if (remainNumber < gamerNumber * MIN_NUMBER_PER) {
            return MAX_NUMBER_PER;
        }

        if (remainNumber < gamerNumber * MAX_NUMBER_PER) {
            return MIN_NUMBER_PER;
        }

        return (int) (Math.random() * (MAX_NUMBER_PER - MIN_NUMBER_PER)) + MIN_NUMBER_PER;
    }

    @Override
    public String getName() {
        return "SUPERT 31 MAN";
    }
}