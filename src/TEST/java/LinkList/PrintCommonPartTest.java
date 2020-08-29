package LinkList;

import LinkList.PrintCommonSortedLinkList.Node;
import LinkList.PrintCommonSortedLinkList.PrintCommonPart;
import org.junit.Test;

/**
 * @author zjbao123
 * @version 1.0
 * @since 2020-08-29 20:47:44
 */
public class PrintCommonPartTest {
    @Test
    public void test(){
        Node part1 = new Node(1);
        part1.setNext(new Node(2));
        part1.getNext().setNext(new Node(3));
        Node part2 = new Node(2);
        part2.setNext(new Node(3));

        PrintCommonPart.PrintCommonPart(part1,part2);
    }
}
