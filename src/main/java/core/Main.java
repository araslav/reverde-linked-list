package core;

public class Main {
    public static void main(String[] args) {
        Node<Integer> nodeSixth = new Node<>(null, 6);
        Node<Integer> nodeFifth = new Node<>(nodeSixth, 5);
        Node<Integer> nodeFourth = new Node<>(nodeFifth, 4);
        Node<Integer> nodeThird = new Node<>(nodeFourth, 3);
        Node<Integer> nodeSecond = new Node<>(nodeThird, 2);
        Node<Integer> nodeFirst = new Node<>(nodeSecond, 1);

        Node reverseBase = ReverseListBaseImpl.reverse(nodeFirst);
        System.out.println(reverseBase);

        Node reverseRecursion = ReverseListRecursionImpl.reverse(reverseBase);
        System.out.println(reverseRecursion);
    }
}
