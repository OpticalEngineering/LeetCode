package Medium;

import java.util.List;

public class Add_Two_Numbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;

        //将l1,12所表示的数相加求结果c
        int i = 0;
        int a,b;
        int c = 0;
        while ( l1 != null || l2 != null)
        {
            if (l1 != null)
            {
                a = l1.val;
                l1 = l1.next;
            }
            else
            {
                a = 0;
            }
            if (l2 != null)
            {
                b = l2.val;
                l2 = l2.next;
            }
            else
            {
                b = 0;
            }

            c = c + (a + b) * (int)Math.pow(10, i);



            i++;
        }

        //将结果c所表示的数转换为ListNode
        result = new ListNode(c%10);
        c = c / 10;
        ListNode d = result;
        while(c > 0)
        {

            ListNode temp = new ListNode(c%10);
            c = c / 10;
            d.next = temp;
            d =temp;

        }

        return result;

    }

    public static void main(String[] args) {

        int[] a = {9};
        int[] b = {1,9,9,9,9,9,9,9,9,9,9};

        ListNode L1 = null;
        ListNode L2 = null;
        for (int i = 0; i < a.length || i < b.length; i++)
        {
            if (i < a.length)
            {
                ListNode temp1 = new ListNode(a[i]);
                temp1.next = L1;
                L1 = temp1;
            }

            if(i < b.length)
            {
                ListNode temp2 = new ListNode(b[i]);
                temp2.next = L2;
                L2 = temp2;
            }


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
