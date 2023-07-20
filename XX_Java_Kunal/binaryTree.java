package XX_Java_Kunal;
import java.util.*;
public class binaryTree {
    public binaryTree() {

    }
    private static class Node{
        int value;
        Node left;
        Node right;
        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner sc){
        System.out.println("Enter the value of root node: ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node)
    {
        System.out.println("Enter left value?");
        boolean left = sc.nextBoolean();
        if(left)
        {
            System.out.println("Enter the value of left node: ");
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }
        System.out.println("Enter right value?");
        boolean right = sc.nextBoolean();
        if(right)
        {
            System.out.println("Enter the value of right node: ");
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }


    public void display(){
        display(root, "");
    }

    private void display(Node node, String indent){
        if(node == null)
        {
            return;
        }
        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        binaryTree bt = new binaryTree();
        bt.populate(sc);
        bt.display();
    }
}
