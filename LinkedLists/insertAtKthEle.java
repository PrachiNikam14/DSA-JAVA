package LinkedLists;

public class insertAtKthEle {
    

    public static Node insertAtKthEle(Node head, int val,int k){
        if(head==null){
        if(k==1){
            return new Node(val);
        }
        else{
            return null;
        }
    }
        if(k==1){
            Node newNode = new Node(val);
            newNode.next=head;
            return newNode;
        }

        int cnt = 0; 
        Node temp = head;
        while(temp!=null){
            cnt++;
            if(cnt==k-1){
                Node newNode = new Node(val);
                newNode.next=temp.next;
                temp.next=newNode;
            }
            temp=temp.next;
        }
        return head;
    }
}
