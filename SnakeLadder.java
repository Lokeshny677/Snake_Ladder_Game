package com.bridgelab.snakeladder;
import java.util.Random;

public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to snake ladder game");
        int player =0;
        Random random =new Random();
        int dieroll = random.nextInt(7);
        int option =random.nextInt();
        System.out.println("Rolling the die");
        System.out.println("Player position " + dieroll);

        switch (option){
            case 1:
                System.out.println("No play");
                break;
            case 2:
                System.out.println("Ladder");
                player +=dieroll;

            case 3:
                System.out.println("Snake bite");
                player -=dieroll;
                break;
        }
    }
}
