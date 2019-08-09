/**
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList
 */

import java.util.ArrayList;
import java.util.Collections;

class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }


public class PrintListFromTailToHead {
    //通过arraylist反转
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result=new ArrayList<Integer>();
        while(listNode!=null){
            result.add(Integer.valueOf(listNode.val));
            listNode=listNode.next;
        }
        Collections.reverse(result);
        return result;
    }

    //通过迭代
    public ArrayList<Integer> printListFromTailToHead1(ListNode listNode){
        ArrayList<Integer> result1=new ArrayList<>();
        if(listNode!=null){
            listAdd(listNode,result1);
        }
        return result1;
    }
    public void listAdd(ListNode listNode, ArrayList<Integer> result1){
        if(listNode!=null){
            listAdd(listNode.next,result1);
            result1.add(Integer.valueOf(listNode.val));
        }
    }

}

