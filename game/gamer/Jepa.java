package game.gamer;

import game.Host;

import java.util.Random;

public class Jepa implements Gamer {
    @Override
    public int answer(int currentNum, int GamerNumber) {
        if(currentNum==31-GamerNumber-1){// 2:28, 3:27, 4:26
            if(GamerNumber==2){
                return 2; // 무조건 2!
            }
            return (int)(Math.random()*2)+2; //1만 아니면 된다
        }else if(currentNum==31-currentNum-2){// 2:27, 3:26, 4:25
            return 3; //무조건 3!
        }else if(currentNum>27){
            if(currentNum>28){//29 30
                return 1;
            }
            return  (int)(Math.random()*2)+1;//28
        }
        return (int)(Math.random()*3)+1;
    }

    @Override
    public String getName() {
        return "jepa";
    }
}
