import java.util.ArrayList;
import java.util.List;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Source {
  public static int sumList(Node<Integer> head) {
    ArrayList<Integer> sol = new ArrayList<>();
    while(head != null) {
      sol.add(head.val);
      head = head.next;
    }
    return sol.stream().mapToInt(val -> val).sum();
  }

  public static void main(String[] args) {
    Node<Integer> a = new Node<>(2);
    Node<Integer> b = new Node<>(8);
    Node<Integer> c = new Node<>(3);
    Node<Integer> d = new Node<>(-1);
    Node<Integer> e = new Node<>(7);

    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;

    // 2 -> 8 -> 3 -> -1 -> 7 = 19

    Node<Integer> node1 = new Node<>(42);
    Node<Integer> node2 = new Node<>(18);
    Node<Integer> node3 = new Node<>(7);
    Node<Integer> node4 = new Node<>(30);
    Node<Integer> node5 = new Node<>(55);

    e.next = node1;
    node1.next = node2;
    node2.next = node3;
    node3.next = node4;
    node4.next = node5;

    // 42, 18, 7, 30, 55 + 19 = 171

    System.out.println("Sum of my list: ");
    System.out.println(Source.sumList(a));
  }
}
