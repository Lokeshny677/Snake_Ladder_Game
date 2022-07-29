package com.bridgelab.snakeladder;
import java.util.Random;

public class SnakeLadder {
    public static void main(String[] args) {
        System.out.println("Welcome to snake ladder game");
        int player =0;
        Random random =new Random();
        int dieroll = random.nextInt(7);
        System.out.println("Rolling the die");
        System.out.println("rolled number " + dieroll);

    }
}
