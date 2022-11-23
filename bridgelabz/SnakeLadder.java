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
            System.out.println(option(dice, opt[a]));
        }

    }

    public static int rolls()
    {
        Random random = new Random();
        int r = random.nextInt(6) + 1;
        return r;

    }

    public static int option(int dice, String opt) {
        if (opt == "No Play")
        {
            position=position;
        }
        else if (opt == "Ladder")
        {

            //return position;
            if((position+dice)>100)
            {
                position=position;
            }
            else {
                position = position + dice;
            }
        }
        else
        {
            position = position - dice;
            if (position < 0) {
                position = 0;
            }
        }
            return position;
    }
}


