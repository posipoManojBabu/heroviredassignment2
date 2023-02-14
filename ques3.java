import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkedList{
    Node head;
    int size;
    LinkedList(){
        this.head=null;
        this.size=0;
    }
    boolean isEmpty(){
        if(this.size==0)
            return true;
        else
            return false; 
    }
    Node getHead(){
        return this.head;
    }
    int getSize() {
        return this.size;
    }
    void appendNode(int data){
        Node currentNode=new Node(data);
        if(isEmpty()==true){
            this.head=currentNode;
        }
        else{
            Node prev=this.head;
            while(prev.next!=null){
                prev=prev.next;
            }
            prev.next=currentNode;
        }
        this.size++;
    }

    void printData(){
        if(this.isEmpty()){
            System.out.println("List is empty");
        }
        else{
            Node currentNode=this.head;
            String listValues="";
            while(currentNode!=null){
                listValues+=String.valueOf(currentNode.data);
                listValues+=" ";
                currentNode=currentNode.next;
            }
            System.out.println(listValues);
        }
    }
    
    public void sortList(){
        Node currentNode=head,index=null;
        int temp;
        if(this.head==null){
            return;
        }
        else{
            while(currentNode!=null){
                index=currentNode.next;
                while(index!=null){
                    if(currentNode.data>index.data){
                        temp=currentNode.data;
                        currentNode.data=index.data;
                        index.data=temp;
                    }
                    index=index.next;
                }
                currentNode=currentNode.next;
            }
        }
    }
}
public class ques3 {
    public static void main(String[] args) {
        LinkedList uniqueLinkedList=new LinkedList();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            uniqueLinkedList.appendNode(a);
        }
        sc.nextLine();
        for(int i=0;i<n;i++){
            int b=sc.nextInt();
            uniqueLinkedList.appendNode(b);
        }
        uniqueLinkedList.sortList();
        uniqueLinkedList.printData();

    }
}
