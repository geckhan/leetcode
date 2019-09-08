package cn.geckhan.leetcode;

public class LinkedAddTwoNumbers {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        LinkedAddTwoNumbers linkedAddTwoNumbers = new LinkedAddTwoNumbers();
        linkedAddTwoNumbers.run();
    }

    private void run() {
        ListNode l1 = new ListNode(5);
//        ListNode l11 = new ListNode(8);
//        l1.next=l11;

        ListNode l2 = new ListNode(5);

        ListNode result = addTwoNumbers(l1, l2);

        do {
            System.out.print(result.val);
            result = result.next;
        } while (result != null);


    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode head = new ListNode(0);
       ListNode p = l1 ,q=l2,current = head;
       int carry = 0;
       while (p!=null||q!=null){
           int x = p!=null?p.val:0;
           int y = q!=null?q.val:0;
           carry = carry+x+y;
           current.next = new ListNode(carry%10);
           current = current.next;
           carry=carry/10;

           if (p!=null)p=p.next;
           if (q!=null)q=q.next;
       }

       if (carry>0){
           current.next=new ListNode(carry);
       }


       return  head.next;
    }


//    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        ListNode airNode = new ListNode(0);
//
//        if (l1==null){
//            l1=airNode;
//        }
//
//        if (l2==null){
//            l2=airNode;
//        }
//
//        int sum = l1.val+l2.val;
//        ListNode currentNode = new ListNode(sum % 10);
//        if ( l1.next != null || l2.next != null) {
//            ListNode nextNode = addTwoNumbers(l1.next, l2.next);
//            if (sum > 9) {
//                nextNode.val = nextNode.val + 1;
//                if (nextNode.val>9){
//                    nextNode.val =  nextNode.val % 10;
//                }
//            }
//            currentNode.next=nextNode;
//        } else if (sum > 9){
//            ListNode nextNode = new ListNode(1);
//            currentNode.next=nextNode;
//        }
//
//        return currentNode;
//
//    }

}
