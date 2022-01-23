/*

Q6. Create an array of 5 elements with values {1,7,4,7,6}.Search value 7 in the given array and print all
the  occurrence(index) of search value(7) by holding the index in a result array . Do it recursively

The prototype of the method is as follows:-

public static int[] res(int arr[], int current index, int search_value)
{
	// set of statements;
}

 */
package recursion;

import java.util.Scanner;

public class SearchMultipleOccurrence
{
    int[] arr,resArr;
    int size,index;
    Scanner sc = new Scanner(System.in);
    SearchMultipleOccurrence()                              // Constructor
    {
        System.out.println("Size of Array : ");
        size = sc.nextInt();                                // Initialize Size of Array
        arr = new int[size];                                // Declaration of Array
        resArr = new int[size];                             // Declaration of result array
    }
    public void setArr()                                    // Set Array Elements
    {
        System.out.println("Enter Array Elements : ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
    }
    public int[] res(int[] arr, int currentIndex, int searchValue)
    {
        if(currentIndex < arr.length)
        {
            if (searchValue == arr[currentIndex])                 // Recursive Function to find multiple occurrences of an element in array
            {
                resArr[index] = currentIndex;
                index++;
            }
            return res(arr, currentIndex + 1, searchValue);
        }
        return resArr;
    }

    public static void main(String[] args)                                        // Main Function Starts
    {
        SearchMultipleOccurrence obj = new SearchMultipleOccurrence();
        Scanner sc = new Scanner(System.in);

        obj.setArr();
        int searchElement;
        System.out.println("Enter Search Element : ");
        searchElement = sc.nextInt();
        for (int i = 0; i < obj.index; i++)
        {
            System.out.println(obj.resArr[i]);                            // Print indexes of element that matched with search element
        }
    }
}