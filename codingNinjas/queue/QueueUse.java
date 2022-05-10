package codingNinjas.queue;

public class QueueUse
{
    public static void main(String[] args)
    {
        //QueueUsingArray queue = new QueueUsingArray();
        QueueUsingLL<Integer> queue = new QueueUsingLL<>();
        int[] arr = {10, 20, 30, 40, 50};
        for ( int element : arr )
        {
           // try {
                queue.enqueue(element);
            //} //catch (QueueFullException e) {
                //e.printStackTrace();
            //}
        }
        while (!queue.isEmpty())
        {
            try {
                System.out.println(queue.dequeue());
            } catch (QueueEmptyException e) {
                // Will never reach here
                e.printStackTrace();
            }
        }
    }
}
