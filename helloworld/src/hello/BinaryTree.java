package hello;

import java.util.Stack;

/**
 * Created by Administrator on 2016/12/13.
 */
public class BinaryTree<T> {
    private Node<T> root;

    public BinaryTree() {
    }

    public void BuildTree() {

    }

    /**
     * 中序遍历(递归)
     */
    public void inOrderTraverse() {
        inOrderTraverse(root);
    }

    public void inOrderTraverse(Node<T> node) {
        if (node != null) {
            inOrderTraverse(node.getLeft());
            System.out.println(node.getValue());
            inOrderTraverse(node.getRight());
        }
    }

    /**
     * 中序遍历(非递归)
     */
    public void nrInOrderTraverse() {
        Stack<Node<T>> stack = new Stack<>();
        Node<T> node = root;
        while (node != null || !stack.isEmpty()) {
            while (node != null) {
                stack.push(node);
                node = node.getLeft();
            }
            node = stack.pop();
            System.out.println(node.getValue()); //输出节点的value
            node = node.getRight();
        }
    }


    /**
     * 先序遍历
     */
    public void preOrderTraverse() {

    }

    public void preOrderTraverse(Node<T> node) {
        if (node != null) {

        }
    }


}
