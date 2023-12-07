package com.bridgelabz.snackladder;

public class UC4_PlayerWinningPosition {
        static public final int Starting_Position_Of_Player = 0;
        static public final int Ending_Position_Of_Player = 100;
        public static final int ladder = 2;
        public static final int snake = 1;
        public static final int noPlay = 0;

        public static int rollDie() {
            int dieValue = (int)(Math.random() * 10) % 6 + 1;
            return dieValue;
        }

        public static void main(String[] args) {
            int presentPlayerPosition = 0;

            while (presentPlayerPosition < Ending_Position_Of_Player) {
                int currentPosition = 0;
                int checkPosition = (int) (Math.random() * 10) % 3;

                switch (checkPosition) {
                    case snake:
                        currentPosition =  rollDie();
                        if ((presentPlayerPosition-currentPosition)>=0 ) {
                            presentPlayerPosition -= currentPosition;
                            System.out.println("player is on snake " +presentPlayerPosition);
                        }
                        break;
                    case ladder:
                        currentPosition =  rollDie();
                        if((presentPlayerPosition+currentPosition)<=100 ) {
                            presentPlayerPosition += currentPosition;
                            System.out.println("player is on Ladder " +presentPlayerPosition);
                        }
                        break;
                    default:
                        System.out.println("player is not play ");
                }

            }

        }

    }

