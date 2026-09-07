class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}


public class insertBeforeValue{
    public static void main(String args[]){
        
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        int val = 3;
        int el = 10;

        head = insertBeforeValue(head, val, el);

        printList(head);
    }

    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node insertBeforeValue(Node head, int val, int el){
        if(head == null){
            return head;
        }
        if(head.data == val){
            Node newNode = new Node(el);
            newNode.next = head;
            return newNode;
        }
        Node temp = head;
        while(temp.next != null){
            if(temp.next.data == val){
                Node newNode = new Node(el);
                newNode.next = temp.next;
                temp.next = newNode;
                return head;
            }
            temp = temp.next;
        }
        
        return head;
    }
}