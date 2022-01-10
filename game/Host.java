package game;

import game.gamer.Gamer;

import java.util.ArrayList;

public class Host {
    private int currentNum;
    private ArrayList<Gamer> gamerList = new ArrayList<>();
    private ArrayList<Integer> answers = new ArrayList<>(); //명사형태
    private StringBuilder sb = new StringBuilder();

    public void receiveApplication(Gamer guest){
        gamerList.add(guest);
    }

    public void startGame(){
        int n = gamerList.size();
        if(n>4){
            sb.append("인원수가 초과했습니다.");
        }else if(n<2){
            sb.append("인원수가 부족합니다.");
        }else{
            sb.append("게임시작!").append('\n');
            recordAnswers(n);//데이터 저장
            printRecordAnswer();//과정 프린트
        }
        System.out.println(sb);
        printSum();
    }

    private void recordAnswers(int n){//변수명이랑 같음
        int turn = 0;
        while(currentNum<31){
            int answer = gamerList.get(turn%n).answer(currentNum,n);
            currentNum+=answer;
//            if(currentNum>31){ answer-=(currentNum-31); } //값에 대한 데이터 조작해버림
            answers.add(answer);
            turn++;
        }
    }

    private void printRecordAnswer(){ // 2 3 1 2 1 -> 12 345
        int currentNum = 0;
        for(int i = 0; i< answers.size() ; i++){
            String currentGamerName = gamerList.get(i% gamerList.size()).getName();
            sb.append(currentGamerName).append("님 :");
            for(int j = 0; j< answers.get(i); j++){
                sb.append(" ").append(++currentNum);
                if(currentNum==31){ //다른 사람이 내말을 안들을수도있음.
                    sb.append('\n').append(currentGamerName).append("패배!");
                    break;
                }
            }sb.append('\n');
        }
    }
    private void printSum(){
        int n=0;
        for(int x: answers){
            n+=x;
        }
        System.out.println(n);
    }
}
