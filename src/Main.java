// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }
     public int[] twoSumSorted(int[] numbers, int target) {
       int low = 0;
        int high = numbers.length-1;
        while(low < high){
            if(numbers[low] + numbers[high] == target){
return new int [] {low + 1, high+1};
             }
            else if( numbers[low]  + numbers[high] > target){
                high--;
            }
            else {
                low++;
            }
                
            }
        
    return new int [] { 1,2};
    }
    public int frequency(String s){

        
        int[] arr = new int[26];
        
        for(char ch : s.toCharArray()) {
            arr[ch - 'a']++;
        }
        int count = 0;
        Set<Integer> set = new HashSet();
        for(int i = 0; i < 26; i++) {
            int frequency = arr[i];
            while(frequency > 0 && set.contains(frequency)) {
                frequency--;
                count++;
            }
            set.add(frequency);
        }
        return count; 
        
    
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode finalList = head;
        int overspill = 0;
        while(l1 != null ||l2 != null || overspill > 0){
            int sum = overspill;
            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }
            overspill = sum/10;
            sum %= 10;
            finalList.next = new ListNode(sum);
            finalList = finalList.next;
        }
        return head.next;
    }

          public ListNode insertGreatestCommonDivisors(ListNode head){  
            ListNode myTracker = head;
            while( head!= null && head.next != null){
            ListNode insert = new ListNode(gcd(head.val, head.next.val));    
                ListNode copyNext = head.next;
                head.next = insert;
                insert.next = copyNext;
                head = head.next.next;
        } 
            return myTracker;
    }
    private int gcd(int a, int b) {
      while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}