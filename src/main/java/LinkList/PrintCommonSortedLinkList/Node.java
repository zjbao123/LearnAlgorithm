package LinkList.PrintCommonSortedLinkList;

/**
 * @author zjbao123
 * @version 1.0
 * @since 2020-08-29 20:38:51
 */
public class Node {
    private int value;
    private Node next;

    public Node(int value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }
}
