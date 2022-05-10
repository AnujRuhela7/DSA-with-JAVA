package codingNinjas;

import java.util.ArrayList;
// A generic tree that can hold any type of data
public class TreeNode<T>
{
    public T data;
    public ArrayList<TreeNode<T>> children;

    // An ArrayList that can hold the references of all the children of a node.
    // We have taken ArrayList so as we can point to any child by its index
    // which wouldn't have been possible if we had taken a LinkedList

    public TreeNode(T data)
    {
        this.data = data;
        children = new ArrayList<>();
    }
}
