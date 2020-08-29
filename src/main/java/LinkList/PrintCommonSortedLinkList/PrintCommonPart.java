package LinkList.PrintCommonSortedLinkList;

/**
 * @author zjbao123
 * @version 1.0
 * @since 2020-08-29 20:38:15
 */
public class PrintCommonPart {
    public static void PrintCommonPart(Node part1,Node part2){
        while(part1 != null && part2 != null){
            if(part1.getValue() == part2.getValue()){
                System.out.println(part1.getValue());
               part1 = part1.getNext();
               part2 = part2.getNext();
            }else if(part1.getValue() < part2.getValue()){
                part1 = part1.getNext();
            }else {
                part2 = part2.getNext();
            }
        }
    }
}
