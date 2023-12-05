package com.bridgelabz.snackladder;
import java.util.Random;
class CheckOption{
    static int initialPosition=0;
    static final  int ladder=1;
    static final int snake=2;
    static final int noPlay=0;
    static int rollDice(){
        int dieValue =(int)Math.floor(Math.random()*10)%6+1;
        return dieValue;
    }

    public static void main(String[] args) {
        int rollDice=rollDice();
        int checkPosition= (int)Math.floor(Math.random()*10)%3;
        System.out.println(checkPosition);
        switch (checkPosition){
            case snake:
                initialPosition=rollDice-initialPosition;
                System.out.println("player is on snake" +initialPosition);
                break;
            case  ladder:
                initialPosition=ladder+rollDice;
                System.out.println("player is on Ladder " +initialPosition);
                break;
            default:
                System.out.println("player is not play " +initialPosition);
        }

    }



}
