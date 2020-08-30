package StackAndQueue.HannoiProblem;

import java.util.Stack;

/**
 * @author zjbao123
 * @version 1.0
 * @since 2020-08-29 21:19:39
 */
public class HannoiMove {
    public static String MID = "mid";
    public static String LEFT = "left";
    public static String RIGHT = "right";

    public enum Type {NO, LtoM, MtoL, RtoM, MtoR}

    public static int process1(int num) {
        return solveProblem1(num, LEFT, RIGHT);
    }


    public static int solveProblem1(int num, String from, String to) {
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
                int part1 = solveProblem1(num - 1, from, another);
                System.out.println("Move " + num + " from " + from + " to " + to);
                int part2 = 1;
                int part3 = solveProblem1(num - 1, another, to);
                return part1 + part2 + part3;
            } else {
                String another = MID;
                int part1 = solveProblem1(num - 1, from, to);
                System.out.println("Move " + num + " from " + from + " to " + another);
                int part2 = 1;
                int part3 = solveProblem1(num - 1, to, from);
                System.out.println("Move " + num + " from " + another + " to " + to);
                int part4 = 1;
                int part5 = solveProblem1(num - 1, from, to);
                return part1 + part2 + part3 + part4 + part5;
            }
        }

    }

    public static int process2(int num) {
        Stack<Integer> lS = new Stack<>();
        Stack<Integer> mS = new Stack<>();
        Stack<Integer> rS = new Stack<>();
        lS.push(Integer.MAX_VALUE);
        mS.push(Integer.MAX_VALUE);
        rS.push(Integer.MAX_VALUE);
        int i = num;
        while (i > 0) {
            lS.push(i);
            i--;
        }
        int step = 0;
        Type[] preAction ={Type.NO};
        while (rS.size() <= num) {
            step += solveProblem2(preAction,Type.MtoL, Type.LtoM,lS,mS,LEFT,MID);
            step += solveProblem2(preAction,Type.LtoM, Type.MtoL,mS,lS,MID,LEFT);
            step += solveProblem2(preAction,Type.MtoR, Type.RtoM,rS,mS,RIGHT,MID);
            step += solveProblem2(preAction,Type.RtoM, Type.MtoR,mS,rS,MID,RIGHT);
        }
        return step;
    }

    public static int solveProblem2(Type[] actions,Type preAction, Type action, Stack<Integer> fromS, Stack<Integer> toS,String from,String to) {
        if(actions.length == 0){
            actions[0] = action;
            toS.push(fromS.pop());
            System.out.println("Move 1 from " + LEFT + " to " + MID);
            return 1;
        }
        else{
            int value;
            if(actions[0] != preAction && (value = fromS.peek()) < toS.peek()){
                toS.push(fromS.pop());
                actions[0] = action;
                System.out.println("Move " +value+ " From " +from+" to "+to);
                return 1;
            }
            return 0;
        }

    }
}
