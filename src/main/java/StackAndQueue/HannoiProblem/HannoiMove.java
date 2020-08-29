package StackAndQueue.HannoiProblem;

/**
 * @author zjbao123
 * @version 1.0
 * @since 2020-08-29 21:19:39
 */
public class HannoiMove {
    public static String MID = "mid";
    public static String LEFT = "left";
    public static String RIGHT = "right";

    public static int process(int num, String from, String to) {
        if (num < 1) {
            return 0;
        }
        if (num == 1) {
            if (from.equals(MID) || to.equals(MID)) {
                System.out.println("Move 1 from " + from + " to " + to);
                return 1;
            } else {
                System.out.println("Move 1 from " + from + " to " + MID);
                System.out.println("Move 1 from " + MID + " to " + to);
                return 2;
            }
        } else {
            if (from.equals(MID) || to.equals(MID)) {
                String another = from.equals(LEFT) || to.equals(LEFT) ? RIGHT : LEFT;
                int part1 = process(num - 1, from, another);
                System.out.println("Move " + num + " from " + from + " to " + to);
                int part2 = 1;
                int part3 = process(num - 1, another, to);
                return part1 + part2 + part3;
            } else {
                String another = MID;
                int part1 = process(num - 1, from, to);
                System.out.println("Move " + num + " from " + from + " to " + another);
                int part2 = 1;
                int part3 = process(num - 1, to, from);
                System.out.println("Move " + num + " from " + another + " to " + to);
                int part4 = 1;
                int part5 = process(num - 1, from, to);
                return part1 + part2 + part3 + part4 + part5;
            }
        }

    }
}
