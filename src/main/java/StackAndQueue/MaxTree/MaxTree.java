package StackAndQueue.MaxTree;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author zjbao123
 * @version 1.0
 * @since 2020-09-21 23:21:51
 */
public class MaxTree {
    public Node getMaxTree(int[] arrays) {
        Node[] nArrs = new Node[arrays.length];
        for (int i = 0; i <= arrays.length; i++) {
            nArrs[i] = new Node(arrays[i]);
        }

        Stack<Node> stack = new Stack<>();
        HashMap<Node, Node> leftStacks = new HashMap<>();
        HashMap<Node, Node> rightStacks = new HashMap<>();

        for (int i = 0; i != nArrs.length; i++) {
            Node curNode = nArrs[i];
            while (!stack.isEmpty() && curNode.value > stack.peek().value) {
                popStackintoMap(stack, leftStacks);
            }
            stack.push(curNode);
        }

        while (!stack.isEmpty()) {
            popStackintoMap(stack, leftStacks);
        }

        for (int i = nArrs.length - 1; i != 0; i--) {
            Node curNode = nArrs[i];
            while (!stack.isEmpty() && curNode.value > stack.peek().value) {
                popStackintoMap(stack, rightStacks);
            }
            stack.push(curNode);
        }

        while (!stack.isEmpty()) {
            popStackintoMap(stack, rightStacks);
        }

        Node head = null;
        for (int i = 0; i != nArrs.length; i++) {
            Node curNode = nArrs[i];
            Node left = leftStacks.get(curNode);
            Node right = rightStacks.get(curNode);
            if (left == null && right == null) {
                head = curNode;
            } else if (left == null) {
                if (right.left == null) {
                    right.left = curNode;
                } else {
                    right.right = curNode;
                }
            } else if (right == null) {
                if (left.left == null) {
                    left.left = curNode;
                } else {
                    left.right = curNode;
                }
            } else {
                Node parent = left.value > right.value ? right : left;
                if (parent.left == null) {
                    parent.left = curNode;
                } else {
                    parent.right = curNode;
                }
            }
        }
        return head;
    }

    public void popStackintoMap(Stack<Node> stack, HashMap<Node, Node> map) {
        Node popNode = stack.pop();
        if (stack.isEmpty()) {
            map.put(popNode, null);
        } else {
            map.put(popNode, stack.peek());
        }
    }
}
