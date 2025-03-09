import java.util.LinkedList;

class LL {
    Node head;
        class Node {
            String data;
            Node next;

            //int size;

           Node(String data) {
                this.data = data;
                this.next = null;
            }
        }
        // To  add the element in the first
        //(String data)
             public void addFirst(String data){
                 Node newNode = new Node(data);
                 if(head == null){
                     head = newNode;
                     return;
                 }
                 newNode.next = head;
                 head = newNode;
             }
          // To add the element in the last
        public void addLast(String data){
            Node newNode  =new Node(data);
            if(head == null){
                head = newNode;
                return;
            }
             Node currNode = head;
            while(currNode.next != null){
                currNode = currNode.next;
            }

            currNode.next = newNode;
        }
        // To print
        public void printList(){
            if(head == null){
                System.out.println("List is empty!");
                return;
            }
            Node currNode = head;
            while(currNode != null){
                System.out.print(currNode.data + " -> ");
                currNode = currNode.next;
            }
            System.out.println("Null");
        }

        public static void main(String[] args) {
            LL list = new LL();
            list.addFirst("Shad");
            list.addFirst("Lucky");
            list.printList();

            list.addLast("Aspas");
            list.printList();
        }
    }