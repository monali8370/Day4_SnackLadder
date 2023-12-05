package com.bridgelabz.snackladder;
import java.util.Random;
public class Uc7_Play2PlayerGame {

        static public final int Starting_Position_Of_Player = 0;
        static public final int Ending_Position_Of_Player = 100;
        public static final int ladder = 2;
        public static final int snake = 1;
        public static final int noPlay = 0;
        static int count = 2;
        static int presentPlayerPosition1 = 0;
        static int presentPlayerPosition2 = 0;
        int p1CurrentPosition = 0;
        int p2CurrentPosition = 0;
        public static int rollDie() {

            int dieValue = (int) (Math.random() * 10) % 6 + 1;

            return dieValue;
        }
        public static void player() {
            int player1 = 0;
            int player2 = 1;

        }
        public void player1(int checkPosition){
            switch (checkPosition) {
                case snake:
                    p1CurrentPosition = rollDie();
                    if ((presentPlayerPosition1 - p1CurrentPosition) >= 0) {
                        presentPlayerPosition1 -= p1CurrentPosition;
                        System.out.println("player1 is on snake " + presentPlayerPosition1);
                    }
                    break;
                case ladder:
                    p1CurrentPosition = rollDie();
                    if ((presentPlayerPosition1 + p1CurrentPosition) <= 100) {
                        presentPlayerPosition1 += p1CurrentPosition;
                        System.out.println("player1 is on Ladder " + presentPlayerPosition1);
                    }
                    break;
                default:
                    System.out.println("player1 is not play ");
            }
        }

        public void player2(int checkPosition){

            switch (checkPosition) {
                case snake:
                    p2CurrentPosition = rollDie();
                    if ((presentPlayerPosition2 - p2CurrentPosition) >= 0) {
                        presentPlayerPosition2 -= p2CurrentPosition;
                        System.out.println("player2 is on snake " + presentPlayerPosition2);
                    }
                    break;
                case ladder:
                    p2CurrentPosition = rollDie();
                    if ((presentPlayerPosition2 + p2CurrentPosition) <= 100) {
                        presentPlayerPosition2 += p2CurrentPosition;
                        System.out.println("player2 is on Ladder " + presentPlayerPosition2);
                    }
                    break;
                default:
                    System.out.println("player2 is not play ");
            }
        }
        public static void main(String[] args) {
            System.out.println("Welcome in snake and ladder game");
           Uc7_Play2PlayerGame snakeAndLadder = new Uc7_Play2PlayerGame();
            while (presentPlayerPosition1 < Ending_Position_Of_Player || presentPlayerPosition2 < Ending_Position_Of_Player) {
                int checkPosition = (int) (Math.random() * 10) % 3;
                if(count%2==0)
                    snakeAndLadder.player1(checkPosition);
                else
                    snakeAndLadder.player2(checkPosition);

                count++;
            }

        }

    }


