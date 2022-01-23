package recursion;

import java.util.Scanner;

public class SearchInArray
{
    int[] arr;
    int size;
    Scanner sc = new Scanner(System.in);
    SearchInArray()
    {
        System.out.println("Size of Array : ");
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
    public static int find(int[] arr, int currentIndex, int searchValue)
    {
        if(arr[currentIndex] == searchValue)
        {
            return currentIndex;
        }
        return find(arr,currentIndex+1,searchValue);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        SearchInArray obj = new SearchInArray();
        obj.setArr();
        System.out.print("Enter Search Element : ");
        try
        {
            System.out.println("Element Found At Index : " + SearchInArray.find(obj.arr, 0, sc.nextInt()));
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Search Element Not Found!!");
        }

    }
}
