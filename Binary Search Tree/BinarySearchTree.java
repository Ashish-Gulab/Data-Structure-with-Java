import java.util.*;

class BinarySearchTree
{
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
        }
    }

    public static Node insert(Node root, int value)
    {
        if(root==null)
        {
            root=new Node(value);
            return root;
        }
        else if(value<root.data)
        {
            root.left=insert(root.left,value);
        }
        else
        {
            root.right=insert(root.right,value);
        }
        return root;
    }

    public static void inorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean search(Node root, int value)
    {
        if(root==null)
        {
            return false;
        }
        if(value<root.data)
        {
            return search(root.left,value);
        }
        else if(value==root.data)
        {
            return true;
        }
        else
        {
            return search(root.right,value);
        }
    }

    public static Node delete(Node root, int value)
    {
        if(value<root.data)
        {
            root.left=delete(root.left,value);
        }

        else if(value>root.data)
        {
            root.right=delete(root.right,value);
        }
        else // value==root.data
        {
            if(root.left==null && root.right==null)
            {
                return null;
            }
            else if(root.left==null)
            {
                return root.right;
            }
            else if(root.right==null)
            {
                return root.left;
            }
            else
            {
                Node isuccesor=inorderSuccessor(root.right);
                root.data=isuccesor.data;
                root.right=delete(root.right,isuccesor.data);
            }
        }
        return root;
    }

    public static Node inorderSuccessor(Node root)
    {
        while(root.left!=null)
        {
            root=root.left;
        }
        return root;
    }

    public static void printInRange(Node root, int X, int Y)
    {
        if(root==null)
        {
            return;
        }
        if(X<=root.data && Y>=root.data)
        {
            printInRange(root.left,X,Y);
            System.out.print(root.data+" ");
            printInRange(root.right,X,Y);
        }
        else if(X>=root.data)
        {
            printInRange(root.right,X,Y);
        }
        else
        {
            printInRange(root.left,X,Y);
        }
    }

    public static void printRoot2Leaf(Node root, ArrayList<Integer> path)
    {
        if(root==null)
        {
            return;
        }
        path.add(root.data);
        if(root.left==null && root.right==null)
        {
            printPath(path);
        }
        else
        {
            printRoot2Leaf(root.left,path);
            printRoot2Leaf(root.right,path);
        }

        path.remove(path.size()-1);
    }

    public static void printPath(ArrayList<Integer> path)
    {
        for(int i=0;i<path.size();i++)
        {
            System.out.print(path.get(i)+"--->");
        }
        System.out.println("Null");
    }

    public static void main(String[] args)
    {
        int[] values={5,1,3,4,2,7};
        Node root=null;

        for(int i=0;i<values.length;i++)
        {
            root=insert(root,values[i]);
        }

        inorder(root);
        
        System.out.println();
        System.out.println(search(root,3));
        System.out.println(search(root,10));

        // delete(root,3);
        // inorder(root);

        printInRange(root,3,7);

        System.out.println();
        ArrayList<Integer> path=new ArrayList<>();
        printRoot2Leaf(root,path);
    }
}