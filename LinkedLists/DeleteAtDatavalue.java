package LinkedLists;
class Node{
     int data;
        Node next;

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }

        Node (int data){
            this.data = data;
            this.next=null;

        }
}


public class DeleteAtDatavalue {

    public static void main(String[] args) {
        
        int arr1[]= {2,3,6,7,8};
        Node head = convertArr2LL(arr1);
        head = deleteAtValue(head,8);
        printLL(head);

    }

    private static Node deleteAtValue(Node head, int val) {
        if (head == null) {
            return null;
        }
        if (head.data == val) {
            return head.next;
        }

        Node temp=head;
        Node prev=null;

        while(temp!=null){
            if(temp.data==val){
                prev.next=prev.next.next;
                break;
            }
            prev=temp;
            temp=temp.next;
        }
      
        return head;
    }

    private static Node convertArr2LL(int[] arr1){
        Node head = new Node(arr1[0]);
        Node mover = head;
        for(int i = 1;i<arr1.length;i++){
            Node temp = new Node(arr1[i]);
            mover.next=temp;
            mover = temp;
        }
        return head;
    }

    private static void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data + " -> ");
            temp=temp.next;
        }
        System.out.println("null");
    }


}
