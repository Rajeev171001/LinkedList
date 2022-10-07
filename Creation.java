public class Mainclassnormal {
    
    static void print(Node head){ 
        Node cur=head; 
        while(cur!=null){

            System.out.print(cur.data+" ");
            cur=cur.next;
        }
    }
        // System.out.print("end");
    
    public static void main(String[] args){
        Node n1=new Node(5);
        Node n2=new Node(6);
        Node n3=new Node(7);
        Node n4=new Node(8);
        Node n5=new Node(9);

        Node head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        // n5.next=n6;

        print(head);
    }
    
}
class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }
}
