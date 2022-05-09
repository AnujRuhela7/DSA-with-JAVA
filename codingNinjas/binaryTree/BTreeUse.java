package codingNinjas.binaryTree;

import codingNinjas.queue.QueueEmptyException;
import codingNinjas.queue.QueueUsingLL;

import java.net.Inet4Address;
import java.util.Scanner;

public class BTreeUse
{
    public static void printTree(BtreeNode<Integer> root)
    {
        if(root == null)
        {
            return;
        }
        String toBePrinted = root.data + " : " ;
        if(root.left != null)
        {
            toBePrinted += "L : " + root.left.data + ",";
        }
        if(root.right != null)
        {
            toBePrinted += "R : " + root.right.data;
        }
        System.out.println(toBePrinted);
        printTree(root.left);
        printTree(root.right);
    }

    //public static void preorder();

    public static BtreeNode<Integer> input(Scanner sc)
    {
        int rootData;
        System.out.println("Enter root data : ");
        rootData = sc.nextInt();
        if(rootData == -1)
        {
            return null;
        }
        BtreeNode<Integer> root = new BtreeNode<>(rootData);
        root.left = input(sc);
        root.right = input(sc);
        return root;
    }

    public static BtreeNode<Integer> inputLevelWise()
    {
        Scanner sc = new Scanner(System.in);
        QueueUsingLL<BtreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        System.out.println("Enter root data : ");
        int rootData = sc.nextInt();
        if(rootData == -1)
        {
            return null;
        }
        BtreeNode<Integer> root = new BtreeNode<>(rootData);
        pendingNodes.enqueue(root);
        while (!pendingNodes.isEmpty()) {
            BtreeNode<Integer> front;
            try {
                front = pendingNodes.dequeue();
            } catch (QueueEmptyException e) {
                return null;
            }
            System.out.println("Enter left child of " + front.data);
            int leftChild = sc.nextInt();
            if(leftChild != -1)
            {
                BtreeNode<Integer> child = new BtreeNode<>(leftChild);
                pendingNodes.enqueue(child);
                front.left = child;
            }
            System.out.println("Enter right child of " + front.data);
            int rightChild = sc.nextInt();
            if(rightChild != -1)
            {
                BtreeNode<Integer> child = new BtreeNode<>(rightChild);
                pendingNodes.enqueue(child);
                front.right = child;
            }
        }
        return root;
    }

    public static void printLevelWise(BtreeNode<Integer> root) throws QueueEmptyException {
        QueueUsingLL<BtreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
        pendingNodes.enqueue(root);

        if(!pendingNodes.isEmpty())
        {
            BtreeNode<Integer> temp = pendingNodes.dequeue();
            System.out.println(temp.data);
            if(temp.left.data != -1)
            {
                printLevelWise(temp.left);
            }
            if(temp.right.data != -1)
            {
                printLevelWise(temp.left);
            }

        }
    }


    public static void main(String[] args) throws QueueEmptyException {
        //Scanner sc = new Scanner(System.in);
        BtreeNode<Integer> root = inputLevelWise();
        printTree(root);
        System.out.println();
        printLevelWise(root);
        //sc.close();
    }
}
