package array;

import java.util.Scanner;

public class MaxSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Size of Array : ");
        int size = sc.nextInt();
        System.out.print("k : ");
        int k = sc.nextInt();
        int tempSum = 0, sumArraySize = 0;
        if(k > size)
        {
            System.out.println("-1");
        }
        else
        {
            int max = 0;
            int[] arr = new int[size];
            int[] sumArray = new int[100];
            System.out.println("Enter array elements : ");
            for (int i = 0; i < arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < arr.length; i++)
            {
                sumArraySize++;
                tempSum = 0;
                for (int j = i; j < k+i; j++)
                {
                    if(k+i<=arr.length)
                        tempSum += arr[j];
                }
                sumArray[i] = tempSum;
            }
            max = sumArray[0];
            for (int i = 1; i < sumArraySize; i++)
            {
                if (sumArray[i] > max)
                    max = sumArray[i];
            }
            System.out.println("Maximum Sum = " + max);
        }
    }
}
/*
    You are given an array of integers and an integer k, your task is to calculate the maximum sum of 'k' consecutive elements in that array.
    If the size of array is less than k then print -1.

        Input Format

        An integer n denoting number of elements
        An integer k
        n elements of the array
        Constraints

        1
        1
        Output Format

        An integer which is the maximum sum of 'k' consecutive elements of the array. If the size of array is less than k then print -1.

        Sample Input 0

        9
        4
        1 3 5 7 9 6 4 2 0
        Sample Output 0

        27
        Explanation 0

        1+3+5+7=16 3+5+7+9=24 5+7+9+6=27 (maximum) 7+9+6+4=26 9+6+4+2=21 6+4+2+0=12

        Answer=27 which is maximum

        Sample Input 1

        3
        5
        1 2 3
        Sample Output 1

        -1
        Explanation 1

        Since n=3 (size of the array) k=5 which is larger than size of the array (n=3)

        So the output is -1
*/
