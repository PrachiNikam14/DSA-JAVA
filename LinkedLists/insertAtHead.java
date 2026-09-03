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

public class insertAtHead {
    public static void main(String[] args) {
        int arr1[]= {2,3,6,7,8};
        Node head = convertArr2LL(arr1);
        printLL(head);
        head = insertAtHead(head,1);
        printLL(head);

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

    private static Node insertAtHead(Node head,int val){
        Node newNode = new Node(val);
        newNode.next=head;
        return newNode;
    }
}
