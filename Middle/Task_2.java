/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode lost = new ListNode(0);
        ListNode currList = lost;
        int cur = 0;

        while(l1 != null || l2 != null|| cur != 0){
            int sum = cur;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
             if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            cur = sum / 10;

            currList.next = new ListNode(sum % 10);
            currList = currList.next;
        }
        return lost.next;
    }
}

/**
Пока оба списка не опустеют мы двигаемся по каждому из узлов
и суммируем их значения, потом сдвигаемся на 1 позицию в сторону 
и повторяем процедуру
 */
