package bridgelabz;

import java.util.Random;

public class SnakeLadder {
    static int position1 = 0,position2=0;
    static String opt[] = {"No Play", "Ladder", "Snake"};
    public static void main(String[] args) {
        System.out.println("Welcome to the Game");
        System.out.println("Game Started with position " + position1);
        till100();
        //System.out.println(option(dice));
    }
    public static void till100() {
        Random random = new Random();
        int dice1 = 0,dice2=0;
        int c=0;

        while (position1 < 100 && position2<100 ) {
            dice1 = rolls();
            dice2 = rolls();
            c=c+1;
            int a1 = random.nextInt(3);
            int a2 = random.nextInt(3);
            position1=option(dice1,opt[a1],position1 );
            position2=option(dice2, opt[a2],position2);
            System.out.println("Position1 :"+position1);
            System.out.println("Position2 :"+position2);
            if(position2==100){
                System.out.println("Player 2 Wins");
                break;
            } else if (position1==100) {
                System.out.println("Player 1 Wins");
                break;
            }
            else {continue;}

            }

        System.out.println("number of times the dice was thrown "+c);

    }

    public static int rolls()
    {
        Random random = new Random();
        int r = random.nextInt(6) + 1;
        return r;

    }

    public static int option(int dice, String opval,int position) {
        if (opval == "No Play")
        {
            position=position;
        }
        else if (opval == "Ladder")
        {

            if((position+dice)>100)
            {
                position=position;
            }
            else {
                position = position + dice;
                Random random = new Random();
                int d=rolls();
                int o = random.nextInt(3);
                position=option(d,opt[o],position );

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


