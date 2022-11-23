package bridgelabz;

import java.util.Random;

public class SnakeLadder {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Game");
        int position=0;
        System.out.println("Game Started with position "+position);
        rolls();
    }
    public static void rolls()
    {
        Random random=new Random();
        System.out.println(random.nextInt(6)+1);
    }
}
