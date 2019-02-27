package questions;

/**
 * AlgorithmTest
 * Class: BinarySearcher
 * Created by hapo on 2019-02-27.
 * Description:
 */

class Node {
    public int value;
    public Node left, right;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}

public class BinarySearcher {
    private static boolean contains(Node root, int value) {
        while(root!=null){
            if(value<root.value) root = root.left;
            else if(value>root.value) root = root.right;
            else return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Node n1 = new Node(1, null, null);
        Node n3 = new Node(3, null, null);
        Node n2 = new Node(2, n1, n3);

        System.out.println(contains(n2, 3));
    }
}
