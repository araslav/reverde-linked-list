package core;

public class ReverseListRecursionImpl implements ReverseList {
    private static int size;

    public static Node reverse(Node node) {
        int step = ++size;

        if (node.nextNode == null) {
            return node;
        }

        Node returnNode =  reverse(node.nextNode);
        node.nextNode.nextNode = node;

        if (step == 1) {
            node.nextNode = null;
        }

        return returnNode;
    }
}
