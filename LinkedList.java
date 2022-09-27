public class MainClassString {
    
    static void print(Node<String>head){  /*for string data, if want to add integer then write Integer irrespect to string */
        Node<String> cur=head;
        while(cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        
    }
    public static void main(String[] args){
        Node<String>n1=new Node<>("r");
        Node<String>n2=new Node<>("a");
        Node<String>n3=new Node<>("j");
        Node<String>n4=new Node<>("i");
        Node<String>n5=new Node<>("v");

        Node<String> head=n1;
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        

        print(head);
    }
    
}
class Node<T>{
    T data;
    Node<T> next;

    public Node(T data){
        this.data=data;
    }
}
