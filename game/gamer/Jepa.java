package game.gamer;

import game.Host;

import java.util.Random;

public class Jepa implements Gamer {
    final String name;
    public Jepa(String name){
        this.name = name;
    }
    @Override
    public int answer(int currentNum, int gamerNumber) {
        double random = Math.random();
        if(currentNum == 31-gamerNumber-1){// 2:28, 3:27, 4:26
            if(gamerNumber == 2){
                return 2; // 무조건 2!
            }
            return (int)(random*2)+2; //1만 아니면 된다
        }else if(currentNum == 31-gamerNumber-2){// 2:27, 3:26, 4:25
            return 3; //무조건 3!
        }else if(currentNum > 27){
            if(currentNum > 28){//29 30
                return 1;
            }
            return  (int)(random*2)+1;//28
        }else if(gamerNumber == 2){
            if(currentNum == 26 || currentNum == 24) {
                return (int) (random * 2) + 1;
            }else if(currentNum == 25){
                return 1;
            }else if(currentNum == 23){
                return 3;
            }
        }
        return (int)(random*3)+1;
    }

    @Override
    public String getName() {
        return name;
    }
}
