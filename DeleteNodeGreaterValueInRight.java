

class LinkList{
    Node head = null;
    class Node{
        private int data;
        private Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }

    public void segregateEvenOdd(){
        if(head == null){
            return ;
        }
        Node curr = head;
        Node end = head;
        Node prev = null;

        while(end.next != null){
            end = end.next;
        }
        Node end_New = end;
        
        while(curr.data %2 != 0 && curr != end){
            end_New.next = curr;
            curr = curr.next;
            end_New.next.next = null;
            end_New = end_New.next;

        }
        
        if(curr.data %2 == 0){
            head = curr;
            while(curr != end){
                if(curr.data % 2 == 0){
                    prev = curr;
                    curr = curr.next;
                }
                else{
                    prev.next = curr.next;
                    curr.next = null;
                    end_New.next = curr;
                    curr = prev.next;
                }
            }
        }else{
            prev = curr;
        }

        if (end_New != end && end.data %2 != 0) 
        { 
            prev.next = end.next; 
            end.next = null; 
            end_New.next = end; 
        }

    }
    
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.print("NULL");
    }

    public void _deleteLesserValue(){
        Node curr = head;
        Node maxNode = head;
        while(curr!=null && curr.next!= null){
            if(maxNode.data > curr.next.data){
                Node temp  = curr.next;
                curr.next = temp.next;
                temp = null;

            }
            else{
                curr = curr.next;
                maxNode = curr;
            }
        }
    }
    public void deleteGreaterValue(){
        if(head == null){
            return;
        }
        reverseList();
        _deleteLesserValue();
        reverseList();
    }
    public void reverseList(){
        Node curr = head;
        Node prev = null;
        Node next = null;
        while(curr!=null){ 
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
    public void add(int data){
        Node last = new Node(data);
        if(head == null){
            head = last;
        }else{
            Node temp = head;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = last;
        }

    }
}


public class DeleteNodeGreaterValueInRight {
    public static void main(String[] args) {
        LinkList ll = new LinkList();
        ll.add(17);
        ll.add(15);
        ll.add(8);
        ll.add(12);
        ll.add(10);
        ll.add(5);
        ll.add(4);
        ll.add(1);
        ll.add(7);
        ll.add(6);

        ll.print();
        ll.segregateEvenOdd();
        System.out.println();
        ll.print();
        
    }
    
}
