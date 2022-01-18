package videoGame;

import java.util.Scanner;

public class GameEntry
{
    private int score;
    private String name;
    public GameEntry(int score, String name)
    {
        this.score = score;
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "( Score : " + score + ", Name : " + name + ")";
    }
}
class GameMain
{
    public static void main(String[] args)
    {
        String tempN;
        int tempS;
        Scanner sc = new Scanner(System.in);
        System.out.print("Number of Players : ");
        int numPlayer = sc.nextInt();
        GameEntry[] gamer = new GameEntry[numPlayer];
        for (int i = 0; i < gamer.length; i++)
        {
            System.out.println("Name & Score of Player " + (i+1) + " : ");
            gamer[i] = new GameEntry(sc.nextInt(),sc.nextLine());
        }
        for (int i = 0; i < gamer.length; i++)
        {
            for (int j = i+1; j < gamer.length; j++)
            {
                if (gamer[i].getScore() < gamer[j].getScore())
                {
                    tempS = gamer[i].getScore();
                    gamer[i].setScore(gamer[j].getScore());
                    gamer[j].setScore(tempS);

                    tempN = gamer[i].getName();
                    gamer[i].setName(gamer[j].getName());
                    gamer[j].setName(tempN);

                }
            }
        }
        for (int i = 0; i < gamer.length; i++)
        {
            System.out.println("Gamer " + (i+1) + " Details : ");
            System.out.println(gamer[i].toString());
//            System.out.println(gamer[i].getName());
//            System.out.println(gamer[i].getScore());
//            System.out.println("");
        }
    }
}
