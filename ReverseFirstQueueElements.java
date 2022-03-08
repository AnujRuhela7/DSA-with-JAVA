import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ReverseFirstQueueElements
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
            q.add(arr[i]);
        }
        for (int i = 0; i < k; i++)
        {
            s.push(q.peek());
            q.remove();
        }
        for (int i = 0; i < k; i++)
        {
            q.add(s.peek());
            s.pop();
        }
        for (int i = 0; i < size-k; i++)
        {
            q.add(q.peek());
            q.remove();
        }
        for (int i = 0; i < size; i++)
        {
            System.out.print(q.peek() + " ");
            q.remove();
        }
    }
}
