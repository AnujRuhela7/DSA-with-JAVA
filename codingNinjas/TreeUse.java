package codingNinjas;

import java.util.Scanner;

public class TreeUse
{
    public static TreeNode<Integer> input(Scanner sc)
    {
        System.out.print("Enter node data : ");
        int data;
        data = sc.nextInt();
        TreeNode<Integer> root = new TreeNode<>(data);
        System.out.println("Enter no. of children for " + data);
        int childCount = sc.nextInt();
        for (int i = 0; i < childCount; i++)
        {
            TreeNode<Integer> child = input(sc);
            root.children.add(child);
        }
        return root;
    }

    public static void print(TreeNode<Integer> root)
    {
        String s = root.data + " : ";
        for (int i = 0; i < root.children.size(); i++)
        {
            s = s + root.children.get(i).data + ",";
        }
        System.out.println(s);
        for (int i = 0; i < root.children.size(); i++)
        {
            print(root.children.get(i));
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        TreeNode<Integer> root = input(sc);
        print(root);

//        Creating Individual Nodes
//        TreeNode<Integer> root  = new TreeNode<>(4);
//        TreeNode<Integer> node1 = new TreeNode<>(2);
//        TreeNode<Integer> node2 = new TreeNode<>(3);
//        TreeNode<Integer> node3 = new TreeNode<>(5);
//        TreeNode<Integer> node4 = new TreeNode<>(6);
//
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//
//        node2.children.add(node4);
//
//        System.out.println(root);
    }
}
