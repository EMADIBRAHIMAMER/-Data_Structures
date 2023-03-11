public class Q2 {
public int size() {
int count = 0;
Node current = head;
while (current != null) {
count++;
current = current.next;
}
return count;
}
}
