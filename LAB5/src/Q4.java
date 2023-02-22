public class Q4 {

private static class Node<E> {
private E element;
private Node<E> next;

public Node(E e, Node<E> n) {
element = e;
next = n;
}

boolean sameSequence(Node L, Node M) {
Node lPtr = L;
Node mPtr = M;

while (lPtr != null && mPtr != null) {
if (lPtr.element != mPtr.element) {
return false;
}

lPtr = lPtr.next;
mPtr = mPtr.next;

if ((lPtr == null && mPtr != null) || (lPtr != null && mPtr == null)) {
return false;
}

}
return true;
}
}

}
