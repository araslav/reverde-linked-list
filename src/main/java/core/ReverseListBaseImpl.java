package core;

public class ReverseListBaseImpl implements ReverseList {
    public static Node reverse(Node node) {
        Node prevNode = null;
        Node currentNode = null;

        while (node != null) {
            currentNode = node;
            node = node.nextNode;
            currentNode.nextNode = prevNode;
            prevNode = currentNode;
        }

        return currentNode;
    }
}
