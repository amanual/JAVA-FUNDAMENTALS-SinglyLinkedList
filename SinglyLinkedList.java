public class SinglyLinkedList{
    private Node head;
    public SinglyLinkedList(){
        this.head = null;
    }    
    public void add(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }
        else{
            Node currentNode = head;
            while(currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }

    }
    public void remove(){
        
        if(head != null || head.getNext() != null){              
            Node currentNode = head;
            while (currentNode.getNext().getNext() != null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(null);   
        }
        else{
            head = null;           
        }
        
    }
    public void printValues(){
        if(head == null){
            System.out.println("Node is empty");
        }
        else{
            Node currentNode = head;
            while(currentNode != null){
                System.out.println(" " + currentNode.getValue());
                currentNode = currentNode.getNext();
            }
        }
    }
    public String toString(){       
        return "" + this.head.getValue();
    }
}