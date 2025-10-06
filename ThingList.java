import java.util.Random;

public class ThingList {
  private Node head;

  private class Node {
    Thing data;
    Node next;
  }

  public void addThing(Thing t) {
    Node n = new Node();
    n.data = t;
    n.next = head;
    head = n;
  }

  public void printAll() {
    for (Node p = head; p != null; p = p.next) {
      System.out.println(p.data.toString());
    }
  }

  public void moveAll(Random rand) {
    for (Node p = head; p != null; p = p.next) {
      p.data.maybeTurn(rand);
      p.data.step();
    }
  }
}
