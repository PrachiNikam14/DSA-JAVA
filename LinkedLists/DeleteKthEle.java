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


public class DeleteKthEle {
    public static void main(String[] args) {
        int arr1[]= {2,5,6,8};
        Node head = convertArr2LL(arr1);
        System.out.println();
        printLL(head);

    }

    private static Node convertArr2LL(int[] arr1) {
        Node head = new Node(arr1[0]);
        Node mover = head;
        for(int i = 1 ; i< arr1.length;i++){
            Node temp = new Node(arr1[i]);
            mover.next=temp;
            mover = temp;
        }
        return head;
    }

    private static void printLL(Node head) {
    Node temp = head;
    while(temp != null) {
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }
    System.out.println("null");
    }

    private static Node deleteKthElement(Node head, int k) {
        if (head == null || k <= 0) {
            return head; // Invalid input
        }

        if (k == 1) {
            head = head.next;
            return head; // Delete the head
        }

        int cnt = 0;  //why we put cnt = 0 because 
        // we want to count the nodes as we traverse the linked list.
        //  We start counting from 1, so when cnt reaches k, 
        // we know we've found the kth node to delete.
        Node temp = head;
        Node prev = null; //why we put prev = null because
        // we need to keep track of the previous node so that
        //  we can update its next pointer


        while (temp != null) {
            cnt++;
            if(cnt == k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;

        }

        return head;
    }

}
