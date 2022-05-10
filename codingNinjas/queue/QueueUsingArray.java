package codingNinjas.queue;

public class QueueUsingArray
{
    private int data[];          // Only the functions will be able to insert or delete data in the queue.
    private int front;      // Index of front element
    private int rear;       // Index of rear element
    private int size;

    public QueueUsingArray()
    {
        data = new int[5];
        front = rear = -1;
    }

    public QueueUsingArray(int capacity)
    {
        data = new int[capacity];
        front = rear = -1;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size==0;
    }

    public void enqueue(int element) throws QueueFullException
    {
        if(size == data.length)
        {
            throw new QueueFullException("Queue is Full");
        }
        if(size == 0)
        {
            front = 0;
        }
        rear++;
        if (rear == data.length)
        {
            rear = 0;                  // Case of Circular Queue
        }
        //    rear = ( rear + 1 ) % data.length;       Another way of changing the value of rear
        data[rear] = element;
        size++;
    }

    public int front() throws QueueEmptyException
    {
        if(size == 0)
        {
            throw new QueueEmptyException("Queue is Empty");
        }
        return data[front];
    }

    public int dequeue() throws QueueEmptyException {
        if(size == 0)
        {
            throw new QueueEmptyException("Queue is Empty");
        }
        int temp = data[front];
        front++;
        if (front == data.length)
        {
            front = 0;          // Case of Circular Queue
        }
        //   front = ( frpnt + 1 ) % data.length;
        size--;
        if(size == 0)
        {
            front = rear = -1;
        }
        return temp;
    }
}