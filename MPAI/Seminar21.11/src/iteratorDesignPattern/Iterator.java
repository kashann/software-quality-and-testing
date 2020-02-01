package iteratorDesignPattern;

public interface Iterator<T> {
	T next();
	T prev();
	boolean hasNext();
	boolean hasPrev();
}
