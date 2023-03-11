public class Q3 {
public boolean equals(DoublyLinkedList l)
{
        if(this == l)
        return true;
        else if(this.size() == l.size()){
        Node<E> e = this.header.getNext();
        Node<E> e2 = l.header.getNext();
        while(e != null){
        if(e.getElement() != e2.getElement())
        return false;
        e = e.getNext();
        e2 = e2.getNext();
        }
        return true;
    }
    return false;
}
}
