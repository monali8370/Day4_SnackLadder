package com.bridgelabz.snackladder;
import java.util.Random;
public class SinglePlayerSnackLadder {
    static final int initialPosition = 0;

        public static void main(String[] args) {
            System.out.println("Welcome in snake ladder program");
            Random random = new Random();
            int diceRoll = random.nextInt(7);

            System.out.println("current position "+diceRoll);

        }

    }

