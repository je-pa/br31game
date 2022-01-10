package game.gamer;
import java.util.ArrayList;
        import java.util.List;
        import java.util.Random;

public class Participant1 implements Gamer {

    private String name;
    private List<Integer> answerList;

    public Participant1 (String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int answer(int lastNum, int gamerNumber) {
        answerList =  new ArrayList<>();
        int loser = 31;
        int num = lastNum + 1;
        // if 31 - lastNum = 4면 28,29,30 리턴, 3 이면 29,30 리턴, 2면 30 리턴, 이외는 랜덤
        if (loser - lastNum == 4) {
            for (int i = 3 ; i > 0 ; i--) {
                answerList.add(loser - i);
            }
        } else if (loser - lastNum == 3) {
            for (int i = 2 ; i > 0 ; i--) {
                answerList.add(loser - i);
            }
        } else if (loser - lastNum == 2) {
            answerList.add(num);
        } else {
            Random ran = new Random();
            int random = ran.nextInt(3) + 1;
            for (int i = 0; i < random; i++) {
                if (num + i <= loser) {
                    answerList.add(num + i);
                } else {
                    break;
                }
            }
        }
        return answerList.size();
    }

}