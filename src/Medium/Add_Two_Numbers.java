package Medium;

import java.util.List;

public class Add_Two_Numbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;

        //将l1,12所表示的数相加求结果c
        int i = 0;
        int a,b;
        int c = 0;
        while ( l1 != null && l2 != null)
        {
            a = l1.val;
            b = l2.val;
            c = c + (a + b) * (int)Math.pow(10, i);

            l1 = l1.next;
            l2 = l2.next;
            i++;
        }

        //将结果c所表示的数转换为ListNode
        while(c > 0)
        {
            /*ListNode temp = new ListNode(c%10);
            temp.next = result;

            result = temp;

            c = c / 10;
            */
            ListNode temp = new ListNode(0);
            if (result != null)
            {
                temp.val = result.val;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] a = {3,4,2};
        int[] b = {5,6,4};

        ListNode L1 = null;
        ListNode L2 = null;
        for (int i = 0; i < 3; i++)
        {
            ListNode temp1 = new ListNode(a[i]);
            ListNode temp2 = new ListNode(b[i]);

            temp1.next = L1;
            temp2.next = L2;

            L1 = temp1;
            L2 = temp2;


        }

        System.out.println(L1 + " " + L2);
        ListNode result = new Add_Two_Numbers().addTwoNumbers(L1,L2);

        System.out.println(result);

    }
}

class ListNode
{
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
