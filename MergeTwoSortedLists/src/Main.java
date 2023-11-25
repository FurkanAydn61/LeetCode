import java.awt.*;

public class Main {


      public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode  mergeTwoLists(ListNode l1, ListNode l2) {
        //Başlangıç için dummy bir düğüm oluşturyoruz
        ListNode dummy = new ListNode();
        //Current düğümü, birleştirilmiş listeyi dolaşmak için kullanılacak
        ListNode current = dummy;

        //Her iki listede de boş olana kadar devam eder
        while(l1 != null && l2 != null){
            //İki listenin başındaki elemanları karşılaştırarak küçük olanı seçiyoruz
            if(l1.val < l2.val){
                //Küçük olanı listeye ekliyoruz
                current.next = l1;
                //l1 deki bir sonraki elemana geçiyoruz
                l1 = l1.next;
            }else{
                //Küçük olanı yeni listeye ekliyoruz
                current.next = l2;
                //l2 den bir sonraki elemana geçiyoruz
                l2 = l2.next;
            }
            //Bir sonraki düğüme geçiyoruz
            current = current.next;
        }
        //Eğer bir liste tamamlanmışsa, diğer listeyi geriye kalan elemanlarıylabirleştiriyoruz
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        // Dummy düğümün bir sonraki elemanı, birleştirilmiş listeyi temsil eder.
        return dummy.next;

    }
}