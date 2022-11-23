package bridgelabz;

import java.util.Random;

public class SnakeLadder {
    static int position = 0;

    public static void main(String[] args) {
        System.out.println("Welcome to the Game");
        System.out.println("Game Started with position " + position);
        till100();
        //System.out.println(option(dice));
    }
    public static void till100() {
        Random random = new Random();
        int dice = 0;
        String opt[] = {"No Play", "Ladder", "Snake"};
        while (position < 100) {
            dice = rolls();
            int a = random.nextInt(3);
            option(dice, opt[a]);
        }
        System.out.println(position);
    }

    public static int rolls()
    {
        Random random = new Random();
        int r = random.nextInt(6) + 1;
        return r;

    }

    public static void option(int dice, String opt) {
        if (opt == "No Play")
        {
            position=position;
        }
        else if (opt == "Ladder")
        {
            position = position + dice;
            //return position;
        }
        else
        {
            position = position - dice;
            if (position < 0) {
                position = 0;
            }
        }
            //return position;
    }
}


