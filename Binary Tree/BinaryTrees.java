import java.util.*;

class BinaryTrees
{
    static class Node
    {
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree
    {
        static int index=-1;
        public static Node createTree(int nodes[])
        {
            index++;
            if(nodes[index]==-1)
            {
                return null;
            }

            Node newNode=new Node(nodes[index]);
            newNode.left=createTree(nodes);
            newNode.right=createTree(nodes);

            return newNode;
        }
    }

    public static void preorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
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

    public static void postorder(Node root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }

    public static void levelOrder(Node root)
    {
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty())
        {
            Node curr=q.remove();
            if(curr==null)
            {
                System.out.println();
                if(q.isEmpty())
                {
                    break;
                }
                else
                {
                    q.add(null);
                }
            }
            else
            {
                System.out.print(curr.data+" ");
                if(curr.left!=null)
                {
                    q.add(curr.left);
                }
                if(curr.right!=null)
                {
                    q.add(curr.right);
                }
            }
        }
    }

    public static int countNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int left=countNodes(root.left);
        int right=countNodes(root.right);

        return left+right+1;
    }

    public static int sumOfNodes(Node root)
    {
        if(root==null)
        {
            return 0;
        }

        int leftSum=sumOfNodes(root.left);
        int rightSum=sumOfNodes(root.right);

        return leftSum+rightSum+root.data;
    }
    
    public static int height(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);

        return Math.max(leftHeight,rightHeight)+1;
    }

    // TC:O(N^2)
    public static int diameterOfTree(Node root)
    {
        if(root==null)
        {
            return 0;
        }
        int leftD=diameterOfTree(root.left);
        int rightD=diameterOfTree(root.right);
        int d3=height(root.left)+height(root.right)+1;

        return Math.max(Math.max(leftD, rightD),d3);
    }

    // TC:O(N)
    static class TreeInfo
    {
        int d;
        int ht;

        TreeInfo(int diameter, int height)
        {
            this.d=diameter;
            this.ht=height;
        }
    }
    public static TreeInfo diameter(Node root)
    {
        if(root==null)
        {
            return new TreeInfo(0,0);
        }
        TreeInfo left=diameter(root.left);
        TreeInfo right=diameter(root.right);

        int myHeight=Math.max(left.ht,right.ht)+1;

        int diameter1=left.d;
        int diameter2=right.d;
        int diameter3=left.ht+right.ht+1;

        int myDiameter=Math.max(Math.max(diameter1,diameter2),diameter3);

        TreeInfo info=new TreeInfo(myDiameter,myHeight);
        return info;
    }

    public static void main(String[] args)
    {
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree=new BinaryTree();
        Node root=tree.createTree(nodes);
        System.out.println(root.data);
        System.out.println(root.left.data);
        System.out.println(root.left.left.data);

        preorder(root);

        System.out.println();
        inorder(root);

        System.out.println();
        postorder(root);

        System.out.println();
        levelOrder(root);

        System.out.println(countNodes(root));

        System.out.println(sumOfNodes(root));

        System.out.println(height(root));

        System.out.println(diameterOfTree(root));

        System.out.println(diameter(root).d);
    }
}
