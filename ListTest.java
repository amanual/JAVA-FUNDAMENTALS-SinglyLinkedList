public class ListTest{
    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        // list.printValues();
        list.remove();
        list.printValues();
    }
}