package codingNinjas.binaryTree;

public class BtreeNode<T>
{
    public T data;
    public BtreeNode<T> left;
    public BtreeNode<T> right;

    public BtreeNode(T data)
    {
        this.data = data;
    }
}
