package com.Practice.SnakeAndLadderProblem;

public class SnakeAndLadderProblem {
    public static void main(String[] args) {
        final int START_POSITION = 0;
        int player = 0;
        int ladder = 0;
        int snake;

        System.out.println("Welcome to snake and ladder game ");
        while (player <= 100) {
            int dice = (int) (Math.random() * 6) + 1;
            int check = (int) (Math.random() * 3);
            switch (check) {
                case 0:
                    player = START_POSITION + ladder;
                    break;

                case 1:
                    ladder = START_POSITION + dice;
                    player = ladder;
                    break;

                case 2:
                    snake = ladder - dice;
                    player = snake;
                    break;
            }
            System.out.println(ladder);
            System.out.println(player);
//            System.out.println(snake);
        }
    }
}
