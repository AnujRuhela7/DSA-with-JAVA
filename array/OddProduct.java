package array;

import java.util.Scanner;

public class OddProduct
{
    Scanner sc = new Scanner(System.in);
    int size;
    int[] arr;
    OddProduct()
    {
        System.out.print("Size of Array : ");
        size = sc.nextInt();
        arr = new int[size];
    }

    public void setArr()
    {
        System.out.println("Enter array elements : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
    }

    public void oddProductPair(int[] arr)
    {
        int product;
        for (int i = 0; i < arr.length-1; i++)
        {
            product = arr[i]*arr[i+1];
            if (( product % 2 ) != 0 )
                System.out.println("Odd Product Pair : " + arr[i] + " * " + arr[i+1] + " = " + product );
        }
    }
}
class OddProductMain
{
    public static void main(String[] args)
    {
        OddProduct obj = new OddProduct();
        obj.setArr();
        obj.oddProductPair(obj.arr);
    }
}