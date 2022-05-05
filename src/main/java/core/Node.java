package core;

public class Node<T> {
    public Node<T> nextNode;
    public T value;

    public Node(Node<T> nextNode, T value) {
        this.nextNode = nextNode;
        this.value = value;
    }
}
