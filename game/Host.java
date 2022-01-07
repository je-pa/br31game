package game;

import game.gamer.Gamer;

import java.util.ArrayList;

public class Host {
    private int currentNum;
    private ArrayList<Gamer> GamerList = new ArrayList<>();
    private ArrayList<Integer> recordAnswers = new ArrayList<>();
    private StringBuilder sb = new StringBuilder();

    public void receiveApplication(Gamer guest){
        GamerList.add(guest);
    }

    public void startGame(){
        int n = GamerList.size();
        if(n>4){
            sb.append("인원수가 초과했습니다.");
        }else if(n<2){
            sb.append("인원수가 부족합니다.");
        }else{
            sb.append("게임시작!").append('\n');
            int turn = 0;
            while(currentNum<31){
//                System.out.println(currentNum);
                int answer = GamerList.get(turn%n).answer(currentNum,n);
                recordAnswers.add(answer);//데이터 저장
                currentNum+=answer;
                turn++;
            }
            printRecordAnswer();
        }
    }
    private void printRecordAnswer(){
        int currentNum = 0;
        for(int i = 0; i< recordAnswers.size() ; i++){
            String currentGamerName = GamerList.get(i% GamerList.size()).getName();
            sb.append(currentGamerName).append("님 :");
            for(int j = 0; j<recordAnswers.get(i); j++){
                sb.append(" ").append(++currentNum);
                if(currentNum==31){
                    sb.append('\n').append(currentGamerName).append("패배!");
                    break;
                }
            }sb.append('\n');
        }
        System.out.println(sb);
    }
}
