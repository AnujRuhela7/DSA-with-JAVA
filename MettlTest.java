import java.util.Scanner;

public class MettlTest
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int input1,input2;
        String input3, input4;
        input1 = sc.nextInt();
        input2 = sc.nextInt();
        input3 = sc.next();
        sc.nextLine();
        input4 = sc.nextLine();

        int curX = Integer.parseInt(input3.charAt(0)+"");
        int curY = Integer.parseInt(input3.charAt(2)+"");
        char curD = input3.charAt(4);

        for (int i = 0; i < input4.length(); i = i + 4)
        {
            char turn = input4.charAt(i);

            switch (curD)
            {
                case 'E':
                {
                    if (turn == 'R')
                    {
                        curD = 'S';
                        if(curY - 1 >= 0)
                        {
                            curY -= 1;
                            break;
                        }
                        else
                        {
                            System.out.println(curX + "-" + curY + "-" + curD + "-ER");
                            System.exit(0);
                        }
                    }
                    else if (turn == 'L')
                    {
                        curD = 'N';
                        if (curY + 1 <= input2)
                        {
                            curY += 1;
                            break;
                        }
                        else
                        {
                            System.out.println(curX + "-" + curY + "-" + curD + "-ER");
                            System.exit(0);
                        }
                    }
                }
                case 'W':
                {
                    if (turn == 'R')
                    {
                        curD = 'N';
                        if (curY + 1 <= input2)
                        {
                            curY += 1;
                            break;
                        }
                        else
                        {
                            System.out.println(curX + "-" + curY + "-" + curD + "-ER");
                            System.exit(0);
                        }
                    }
                    else if (turn == 'L')
                    {
                        curD = 'S';
                        if (curY - 1 >= 0)
                        {
                            curY -= 1;
                            break;
                        }
                        else
                        {
                            System.out.println(curX + "-" + curY + "-" + curD + "-ER");
                            System.exit(0);
                        }
                    }
                }
                case 'N':
                {
                    if (turn == 'R')
                    {
                        curD = 'E';
                        if(curX + 1 <= input1)
                        {
                            curX += 1;
                            break;
                        }
                        else
                        {
                            System.out.println(curX + "-" + curY + "-" + curD + "-ER");
                            System.exit(0);
                        }
                    }
                    else if (turn == 'L')
                    {
                        curD = 'W';
                        if (curX - 1 >= 0)
                        {
                            curX -= 1;
                            break;
                        }
                        else
                        {
                            System.out.println(curX + "-" + curY + "-" + curD + "-ER");
                            System.exit(0);
                        }
                    }
                }
                case 'S':
                {
                    if (turn == 'R')
                    {
                        curD = 'W';
                        if (curX - 1 >= 0)
                        {
                            curX -= 1;
                            break;
                        }
                        else
                        {
                            System.out.println(curX + "-" + curY + "-" + curD + "-ER");
                            System.exit(0);
                        }
                    }
                    else if (turn == 'L')
                    {
                        curD = 'E';
                        if (curX + 1 <= input1)
                        {
                            curX += 1;
                            break;
                        }
                        else
                        {
                            System.out.println(curX + "-" + curY + "-" + curD + "-ER");
                            System.exit(0);
                        }
                    }
                }
                default:
                    break;
            }
        }
        System.out.println(curX+"-"+curY+"-"+curD);
    }
}