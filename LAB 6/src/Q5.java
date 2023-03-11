public class Q5 {
public void merge(DoublyLinkedList M){
if(!isEmpty() && !M.isEmpty()){
while(!M.isEmpty()){
addLast((E) M.removeFirst());
}
}
}
}
