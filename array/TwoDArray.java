package array;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoDArray
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int x = sc.nextInt();
        System.out.println("Enter the number of columns : ");
        int y = sc.nextInt();
        int[][] array = new int[x][y];
        System.out.println("Enter array elements : ");
        for(int i = 0; i <x; i++)
        {
            for (int j = 0; j <y; j++)
            {
                array[i][j] = sc.nextInt();
            }
        }
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        for(int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                if(array[i][j] % 2 == 0)
                {
                    even.add(array[i][j]);
                }
                else
                {
                    odd.add(array[i][j]);
                }
            }
        }
        System.out.println("Even Elements : " + even);

        System.out.println("Odd Elements : " + odd);
    }

}
