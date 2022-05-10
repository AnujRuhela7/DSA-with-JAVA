package codingNinjas.queue;

import codingNinjas.linkedlist.Node;

public class QueueUsingLL<T>
{
    private Node<T> front;
    private Node<T> rear;
    int size;

    public QueueUsingLL()
    {
        front = null;
        rear = null;
        size = 0;
    }

    public int size()
    {
        return size;
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public void enqueue(T element)
    {
        Node<T> newNode = new Node<>(element);
        size++;
        if (front == null)
        {
            front = newNode;
            rear = newNode;
        }
        else
        {
            rear.next = newNode;
            rear = newNode;         // rear = rear.next;
        }
    }

    public T front() throws QueueEmptyException {
        if (front == null)
        {
            throw new QueueEmptyException("Queue is empty.");
        }
        return front.data;
    }

    public T dequeue() throws QueueEmptyException {
        if (front == null)
        {
            throw new QueueEmptyException("Queue is empty.");
        }
        T temp = front.data;
        front = front.next;
        if(front == null)
        {
            rear = null;
        }
        size--;
        return temp;
    }
}
