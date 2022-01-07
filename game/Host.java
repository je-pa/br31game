package game;

import game.gamer.IGamer;

import java.util.ArrayList;

public class Host {
    private int currentNum;
    private ArrayList<IGamer> guestList = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    public void receiveApplication(IGamer guest){
        guestList.add(guest);
    }

    public void startGame(){
        int n = guestList.size();
        if(n>4){
            sb.append("인원수가 초과했습니다.");
        }else if(n<2){
            sb.append("인원수가 부족합니다.");
        }else{
            sb.append("게임시작!").append('\n');
            for(int i=0 ; currentNum<30 ; i++){
                IGamer currentGuest = guestList.get(i%n);
                recordAnswer(currentGuest,currentGuest.answer(this));//데이터 저장
            }
        }
    }
    private void recordAnswer(IGamer guest , int answerNum){
        sb.append(guest.getName()).append(" 님 : ");
//        for(int i=0 ; i<a){
//
//        }
    }
}
