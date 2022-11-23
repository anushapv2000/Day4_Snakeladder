package bridgelabz;

import java.util.Random;

public class SnakeLadder {
    static int position=0;
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Game");

        int dice=0;
        System.out.println("Game Started with position "+position);
        Random random=new Random();
        dice=rolls();

        String opt[]={"No Play","Ladder","Snake"};
        int a=random.nextInt(3);
        System.out.println(option(dice,opt[a]));
        //System.out.println(option(dice));
    }
    public static int rolls()
    {
        Random random=new Random();
        int r=random.nextInt(6)+1;
        return r;

    }
    public static int option(int dice,String opt){
        if (opt=="No Play")
        {
            return position;
        } else if (opt=="Ladder") {
            position=position+dice;
            return position;
        }
        else
        {
            position=position-dice;

            return position;
        }

    }
}
