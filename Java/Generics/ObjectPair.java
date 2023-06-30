/**
 * Immutable 2-tuple type.
 * 
 * @author Nathan Sprague
 * @version V1, 8/2016
 */
public class ObjectPair<E,F> {

  private final E first;
  private final F second;

  /**
   * Create an ObjectTuple with the provided objects.
   * 
   * @param first The first object.
   * @param second The second object.
   */
  public ObjectPair(E first, F second) {
    this.first = first;
    this.second = second;
  }

  public E getFirst() {
    return first;
  }

  public F getSecond() {
    return second;
  }

  @Override
  public String toString() {
    return "<" + first.toString() + ", " + second.toString() + ">";
  }

}
