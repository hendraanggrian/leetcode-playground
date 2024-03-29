public abstract class ListNode<T extends ListNode<T>> {
  public abstract int getValue();

  public abstract T getNext();

  public abstract void setNext(T node);

  public final boolean hasNext() {
    return getNext() != null;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || o.getClass().isInstance(getClass())) {
      return false;
    }
    var node1 = this;
    var node2 = (ListNode<T>) o;
    while (node1 != null && node2 != null) {
      if (node1.getValue() != node2.getValue()) {
        return false;
      }
      node1 = node1.getNext();
      node2 = node2.getNext();
    }
    return true;
  }
}
